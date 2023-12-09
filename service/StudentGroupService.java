package oop5_java.service;

import oop5_java.model.StudyGroup;

public class StudentGroupService {
    private StudyGroup studentGroup;

    public StudentGroupService(StudyGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudyGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudyGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

}
