package bean;

import java.util.Map;

public class TestListSubject {

    private int entYear;
    private String studentNo;
    private String studentName;
    private String classNum;
    private Map<Integer, Integer> points;

    // 入学年度
    public int getEntYear() {
        return entYear;
    }

    public void setEntYear(int entYear) {
        this.entYear = entYear;
    }

    // 学籍番号
    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    // 学生名
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // クラス番号
    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    // 点数一覧取得
    public Map<Integer, Integer> getPoints() {
        return points;
    }

    // 点数一覧設定
    public void setPoints(Map<Integer, Integer> points) {
        this.points = points;
    }

    // 指定キーの点数取得
    public Integer getPoint(int key) {
        return points.get(key);
    }

    // 点数追加
    public void putPoint(int key, int value) {
        points.put(key, value);
    }
    
}
