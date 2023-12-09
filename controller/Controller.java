package oop5_java.controller;

import java.util.ArrayList;
import java.util.List;

import oop5_java.model.Student;
import oop5_java.model.StudyGroup;
import oop5_java.model.Teacher;
import oop5_java.model.Type;
import oop5_java.model.User;
import oop5_java.service.DataService;
import oop5_java.view.StudentView;
import oop5_java.view.TeacherView;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();

    public void createStudent(String firstName, String secondName, String lastName){
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent(){
        for (User user : service.getAllStudent()) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        service.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void getAllTeacher(){
        for (User user : service.getAllTeacher()) {
            teacherView.printOnConsole((Teacher) user);
        }
    }

    public void formGroup(){
        
        int divideStudents = service.getAllStudent().size() / service.getAllTeacher().size();

        List<User> tempList = new ArrayList<>();
        StudyGroup studyGroup;

        for (User user : service.getAllStudent()) {
            tempList.add(user);
        }

        for (int j = 0; j < service.getAllTeacher().size(); j++) {
            List<User> subGroup = new ArrayList<>();

            for (int i = 0; i < divideStudents; i++) {
                subGroup.add(tempList.get(0));
                tempList.remove(0);
            }

            studyGroup = new StudyGroup(service.getAllTeacher().get(j), subGroup);
            System.out.println(studyGroup);
        }
    }
}
