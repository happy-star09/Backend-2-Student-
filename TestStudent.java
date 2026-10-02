public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        GraduateStudent s = new GraduateStudent("赵六", "20220916001", 100, "你");

        Student student2 = new Student("张三", "20260916001", 99);
        Student student3 = new Student("李四", "20260916002", 98);
        Student student4 = new Student("王五", "20260916003", 97); // 创建对象

        s.introduce(); // 调用introduce方法，这里调的是子类里重写了父类的方法
        s.research(); // 这里调的是子类里特有的方法research
        student1.introduce(); // 调用父类里的introduce方法
        student2.introduce();
        student3.introduce();
        student4.introduce();
    }
}
