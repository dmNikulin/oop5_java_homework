package oop5_java.model;

public class Student extends User {

    private int studentId;

    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Студент [ID= " + studentId + ", " +
                "Имя= " + super.getFirstName() +
                ", Фамилия= " + super.getSecondName() +
                ", Отчество= " + super.getLastName() + "]";
    }
}
