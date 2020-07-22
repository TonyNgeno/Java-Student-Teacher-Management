package com.tonyngeno;

public class Teacher {
    private String name;
    private String teacherRegNo;
    private Subject subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherRegNo() {
        return teacherRegNo;
    }

    public void setTeacherRegNo(String teacherRegNo) {
        this.teacherRegNo = teacherRegNo;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    @Override
    public String toString() {
        return   "Name:" + this.getName() + " " + "Teacher Reg No:"+ this.getTeacherRegNo() + " " + "Subject: " + this.getSubject();
    }
}
