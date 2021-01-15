package TI52;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Huynh Thi Ai Linh", 8, 9);

        Student student2 = new Student(2, "Huynh Thi Khanh Linh", 9, 8);

        Student student3 = new Student();
        student3.inputInfo();

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
    }
}
