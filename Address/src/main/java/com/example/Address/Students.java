package com.example.Address;

public class Students {
    private int studentId;
    private String name;

    public Students(int studentId) {
        this.studentId = studentId;
    }

    public Students() {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
