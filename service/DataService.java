package oop5_java.service;

import java.util.ArrayList;
import java.util.List;

import oop5_java.model.Student;
import oop5_java.model.Teacher;
import oop5_java.model.Type;
import oop5_java.model.User;

public class DataService {

    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getMaxId(type);

        if (type == Type.STUDENT) {
            userList.add(new Student(firstName, secondName, lastName, id));
        }
        if (type == Type.TEACHER) {
            userList.add(new Teacher(firstName, secondName, lastName, id));
        }
    }

    private int getMaxId(Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;

        for (User i : userList) {
            if (i instanceof Teacher && !itsStudent) {
                lastId = ((Teacher) i).getTeacherId() + 1;
            }
            if (i instanceof Student && itsStudent) {
                lastId = ((Student) i).getStudentId() + 1;
            }
        }
        return lastId;
    }

    public List<User> getAllStudent() {
        List<User> resultList = new ArrayList<>();

        for (User user : userList) {
            if (user instanceof Student) {
                resultList.add(user);
            }
        }

        return resultList;
    }

    public List<User> getAllTeacher() {
        List<User> resultList = new ArrayList<>();

        for (User user : userList) {
            if (user instanceof Teacher) {
                resultList.add(user);
            }
        }

        return resultList;
    }
}
