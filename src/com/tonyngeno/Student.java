package com.tonyngeno;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    ArrayList<Subject> subjects = new ArrayList<>();
    private String name;
    private String studentRegNo;
    int result;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentRegNo() {
        return studentRegNo;
    }

    public void setStudentRegNo(String studentRegNo) {
        this.studentRegNo = studentRegNo;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "," + "StudentId: " + this.studentRegNo;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

}
