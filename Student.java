public class Student {
    private String name;
    private String studentId;
    private int score;

    public Student() {

    }
    public Student(String name, String studentId, int score) { // 这里是构造方法
        this.name = name;
        this.studentId = studentId;
        this.score = score; // 这里是在给参数赋值
    }
    public String getName() { // 提供一个信息的读取窗口
        return name;
    }
    public void setName(String name) { // 提供一个信息的修改窗口
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) { // 划定范围
        if(score > 100 || score < 0) {
            System.out.println("输入错误！成绩不可为负，满分为100分！");
        }
        else{
            this.score = score;
        }
    }
    public void introduce() {
        System.out.println("我是" + name + "，学号" + studentId + "，成绩" + score);
    }
}
