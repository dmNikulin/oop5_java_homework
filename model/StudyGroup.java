package oop5_java.model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    @Override
    public String toString() {
        return "Учебная группа [Учитель: " + teacher + "," + "\n студент= " + students + "]";
    }

    private User teacher;
    private List<User> students = new ArrayList<>();
    
    public StudyGroup(User teacher, List<User> students) {
        this.teacher = teacher;
        this.students = students;
    }
}
