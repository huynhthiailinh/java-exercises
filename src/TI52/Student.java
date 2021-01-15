package TI52;

import java.util.Scanner;

public class Student {
    private long id;
    private String name;
    private float theoryMark;
    private float practiceMark;

    public Student() {
    }

    public Student(long id, String name, float theoryMark, float practiceMark) {
        this.id = id;
        this.name = name;
        this.theoryMark = theoryMark;
        this.practiceMark = practiceMark;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTheoryMark() {
        return theoryMark;
    }

    public void setTheoryMark(float theoryMark) {
        this.theoryMark = theoryMark;
    }

    public float getPracticeMark() {
        return practiceMark;
    }

    public void setPracticeMark(float practiceMark) {
        this.practiceMark = practiceMark;
    }

    public float averageMark(float theoryMark, float practiceMark) {
        return (theoryMark+practiceMark)/2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theoryMark=" + theoryMark +
                ", practiceMark=" + practiceMark +
                '}';
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id: ");
        this.setId(scanner.nextLong());
        scanner.nextLine();
        System.out.print("Enter name: ");
        this.setName(scanner.nextLine());
        System.out.print("Enter theory mark: ");
        this.setTheoryMark(scanner.nextFloat());
        System.out.print("Enter practice mark: ");
        this.setPracticeMark(scanner.nextFloat());
    }

    public void showInfo() {
        System.out.format("%5d | ", this.getId());
        System.out.format("%25s | ", this.getName());
        System.out.format("%10.1f | ", this.getTheoryMark());
        System.out.format("%10.1f | ", this.getPracticeMark());
        System.out.format("%10.1f%n | ", this.averageMark(this.theoryMark, this.practiceMark));
    }
}
