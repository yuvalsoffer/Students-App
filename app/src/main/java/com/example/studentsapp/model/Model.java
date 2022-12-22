package com.example.studentsapp.model;

import java.util.LinkedList;
import java.util.List;

public class Model {
    private static final Model _instance = new Model();

    public static Model instance() {
        return _instance;
    }

    private Model() {
        for (int i = 0; i < 20; i++) {
            addStudent(new Student("name "+i, ""+i, ""+i, ""+i, "", false));
        }
    }

    List<Student> data = new LinkedList<>();

    public List<Student> getAllStudents() {
        return data;
    }

    public Student getStudentAtIndex(int index) {
        Student s = data.get(index);

        return s;
    }

    public void setStudentAtIndex(Student s, int index) {
        data.set(index, s);
    }

    public void deleteStudentAtIndex(int index) {
        data.remove(index);
    }

    public void addStudent(Student st) {
        data.add(st);
    }
}
