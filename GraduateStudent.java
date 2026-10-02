public class GraduateStudent extends Student { // 继承Student公开的的属性和状态

    private String advisor; // 添加了一个新属性

    public GraduateStudent(String name, String studentId, int score, String advisor) {
        super(name, studentId, score); // 调用父类里面的赋值
        this.advisor = advisor;
    }
    public String getAdvisor() {
        return advisor;
    }
    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }
    @Override // 注释说明有重写，可以防止下面的方法名或者参数输错而报错
    public void introduce() {
        System.out.println("我是" + getName() + "，学号" + getStudentId() + "，成绩" + getScore() + "，我的导师是" + advisor);
    }
    public void research() { // 新增的特有方法
        System.out.println("我在做科研");
    }
}
