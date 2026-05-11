#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
プロジェクト内容をまとめたテキストファイルを生成するスクリプト
AI最適化版：相対パス使用、マークダウン形式、パス区切り統一
"""

import os
import re
import subprocess
import sys
from datetime import datetime

# スキップするディレクトリとファイル
SKIP_DIRS = {
    ".git",
    ".settings",
    "__pycache__",
    "build",
    ".classpath",
    ".project",
    ".gitignore",
}
BINARY_EXTENSIONS = {
    ".class",
    ".jar",
    ".war",
    ".zip",
    ".png",
    ".jpg",
    ".jpeg",
    ".gif",
    ".dll",
    ".so",
}
SOURCE_EXTENSIONS = {
    ".java",
    ".jsp",
    ".xml",
    ".properties",
    ".sql",
    ".json",
    ".yml",
    ".yaml",
    ".txt",
    ".md",
}


def get_commit_hash(base_path):
    """Gitコミットハッシュを取得（短形式）"""
    try:
        result = subprocess.run(
            ["git", "rev-parse", "--short", "HEAD"],
            cwd=base_path,
            capture_output=True,
            text=True,
            timeout=5,
        )
        if result.returncode == 0:
            return result.stdout.strip()
    except Exception:
        pass
    return "unknown"


def get_generation_number(base_path):
    """生成回数を取得（既存ファイルの数 + 1）"""
    try:
        files = os.listdir(base_path)
        # {N}_PROJECT_SUMMARY.md または {N}_{HASH}_PROJECT_SUMMARY.md パターンのファイルをカウント
        pattern = r"^(\d+)_.*_PROJECT_SUMMARY\.md$|^(\d+)_PROJECT_SUMMARY\.md$"
        matches = []
        for f in files:
            m = re.match(pattern, f)
            if m:
                # グループ1またはグループ2から数字を取得
                num = m.group(1) or m.group(2)
                matches.append(int(num))

        if matches:
            return max(matches) + 1
        return 1
    except Exception:
        return 1


def is_binary_file(filepath):
    """バイナリファイルか判定"""
    _, ext = os.path.splitext(filepath)
    return ext.lower() in BINARY_EXTENSIONS


def should_skip_dir(dirname):
    """スキップするディレクトリか判定"""
    return dirname in SKIP_DIRS or dirname.startswith(".")


def get_relative_path(filepath, base_path):
    """相対パスを取得（スラッシュで統一）"""
    try:
        rel_path = os.path.relpath(filepath, base_path)
        # パス区切りをスラッシュに統一
        return rel_path.replace(os.sep, "/")
    except ValueError:
        return filepath


def read_file_content(filepath, max_size=1000000):
    """ファイル内容を読み込む（サイズ制限付き）"""
    try:
        with open(filepath, "r", encoding="utf-8") as f:
            content = f.read(max_size)
            if len(content) >= max_size:
                content += "\n\n[ファイルサイズが大きいため、省略されました]"
            return content
    except Exception as e:
        return f"[読み込みエラー: {str(e)}]"


def scan_directory(base_path):
    """ディレクトリをスキャンしてファイル情報を収集"""
    file_structure = {}

    for root, dirs, files in os.walk(base_path):
        # スキップディレクトリをフィルタリング
        dirs[:] = [d for d in dirs if not should_skip_dir(d)]

        for file in files:
            filepath = os.path.join(root, file)
            rel_path = get_relative_path(filepath, base_path)

            # ファイル情報を記録
            if rel_path not in file_structure:
                file_structure[rel_path] = {
                    "is_binary": is_binary_file(filepath),
                    "filepath": filepath,
                    "rel_path": rel_path,
                }

    return file_structure


def generate_summary(base_path, output_file, gen_number=1, commit_hash="unknown"):
    """プロジェクト内容をまとめたテキストを生成（AI最適化版）"""

    print(f"スキャンを開始: {base_path}")
    file_structure = scan_directory(base_path)

    output = []

    # ヘッダー
    output.append("# Score Management System - プロジェクト内容")
    output.append("")
    output.append(f"**生成日時**: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
    output.append(f"**生成回数**: {gen_number}")
    if commit_hash != "unknown":
        output.append(f"**Commit Hash**: `{commit_hash}`")
    output.append("")

    # プロジェクト概要
    output.append("## プロジェクト概要")
    output.append("")
    output.append("このプロジェクトはJavaベースの成績管理システムです。")
    output.append("Spring MVC的なフロントコントローラーパターンを採用し、")
    output.append("Servletを使用したMVC アーキテクチャで実装されています。")
    output.append("")

    # ファイル統計
    total_files = len(file_structure)
    binary_files = sum(1 for f in file_structure.values() if f["is_binary"])
    source_files = total_files - binary_files

    output.append("## ファイル統計")
    output.append("")
    output.append(f"- 総ファイル数: {total_files}")
    output.append(f"- ソースファイル数: {source_files}")
    output.append(f"- バイナリファイル数: {binary_files}")
    output.append("")

    # ディレクトリ構造
    output.append("## ディレクトリ構造")
    output.append("")
    output.append("```")

    sorted_files = sorted(file_structure.items())
    dir_tree = {}

    # ツリー構造を構築
    for rel_path, info in sorted_files:
        parts = rel_path.split("/")
        current = dir_tree
        for i, part in enumerate(parts[:-1]):
            if part not in current:
                current[part] = {}
            current = current[part]
        # ファイル情報を保存
        if parts[-1] not in current:
            current[parts[-1]] = info

    # ツリーを出力
    def print_tree(tree, prefix="", output_list=None):
        if output_list is None:
            output_list = []
        items = sorted(tree.items())
        for i, (name, value) in enumerate(items):
            is_last = i == len(items) - 1
            connector = "└── " if is_last else "├── "
            if isinstance(value, dict) and "filepath" not in value:
                # ディレクトリ
                output_list.append(f"{prefix}{connector}{name}/")
                next_prefix = prefix + ("    " if is_last else "│   ")
                print_tree(value, next_prefix, output_list)
            else:
                # ファイル
                if "is_binary" in value and value["is_binary"]:
                    output_list.append(f"{prefix}{connector}{name} (binary)")
                else:
                    output_list.append(f"{prefix}{connector}{name}")
        return output_list

    tree_lines = print_tree(dir_tree)
    output.extend(tree_lines)
    output.append("```")
    output.append("")

    # ファイルカテゴリ別整理
    output.append("## ファイル構成")
    output.append("")

    # Javaファイル
    java_files = [p for p, info in sorted_files if p.endswith(".java")]
    if java_files:
        output.append("### Java Source Files")
        output.append("")
        for filepath in java_files:
            output.append(f"- `{filepath}`")
        output.append("")

    # JSPファイル
    jsp_files = [p for p, info in sorted_files if p.endswith(".jsp")]
    if jsp_files:
        output.append("### JSP View Files")
        output.append("")
        for filepath in jsp_files:
            output.append(f"- `{filepath}`")
        output.append("")

    # XML設定ファイル
    xml_files = [p for p, info in sorted_files if p.endswith(".xml")]
    if xml_files:
        output.append("### Configuration Files (XML)")
        output.append("")
        for filepath in xml_files:
            output.append(f"- `{filepath}`")
        output.append("")

    # バイナリファイル
    binary_files_list = [p for p, info in sorted_files if info["is_binary"]]
    if binary_files_list:
        output.append("### Binary Files")
        output.append("")
        for filepath in binary_files_list:
            output.append(f"- `{filepath}`")
        output.append("")

    # ソースコード内容
    output.append("## ソースコード詳細")
    output.append("")

    for rel_path, info in sorted_files:
        if not info["is_binary"]:
            _, ext = os.path.splitext(rel_path)
            if ext in SOURCE_EXTENSIONS:
                output.append(f"### File: `{rel_path}`")
                output.append("")
                output.append(
                    "```"
                    + ("java" if ext == ".java" else "" if ext == ".jsp" else ext[1:])
                )

                content = read_file_content(info["filepath"])
                output.append(content)
                output.append("```")
                output.append("")

    # ファイルに出力
    output_text = "\n".join(output)

    try:
        with open(output_file, "w", encoding="utf-8") as f:
            f.write(output_text)
        print(f"[OK] 完了: {output_file}")
        print(f"     ファイルサイズ: {len(output_text) / 1024:.2f} KB")
    except Exception as e:
        print(f"[ERROR] {str(e)}")
        sys.exit(1)


def main():
    """メイン関数"""
    # プロジェクトルートパスを取得
    script_dir = os.path.dirname(os.path.abspath(__file__))
    project_root = script_dir

    # commitハッシュを取得
    commit_hash = get_commit_hash(project_root)

    # 生成回数を取得
    gen_number = get_generation_number(project_root)

    # 出力ファイルパス：commitハッシュの有無で分ける
    if commit_hash != "unknown":
        # gitリポが存在する場合：{生成回数}_{commitハッシュ}_PROJECT_SUMMARY.md
        output_file = os.path.join(
            project_root, f"{gen_number}_{commit_hash}_PROJECT_SUMMARY.md"
        )
        hash_display = f"**Commit Hash**: `{commit_hash}`"
    else:
        # gitリポが存在しない場合：{生成回数}_PROJECT_SUMMARY.md
        output_file = os.path.join(project_root, f"{gen_number}_PROJECT_SUMMARY.md")
        hash_display = ""

    print("=" * 60)
    print("Score Management System - プロジェクト概要生成ツール")
    print("=" * 60)
    print(f"生成回数: {gen_number}")
    if hash_display:
        print(f"Commit Hash: {commit_hash}")
    else:
        print("Git Repository: Not found (hash omitted)")
    print(f"出力先: {os.path.basename(output_file)}")
    print()

    # サマリーを生成
    generate_summary(project_root, output_file, gen_number, commit_hash)

    print()
    print("=" * 60)
    print("処理完了")
    print("=" * 60)


if __name__ == "__main__":
    main()
