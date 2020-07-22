package com.tonyngeno;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student = new Student();


    @Test
    public void getNameTest() {
        student.setName("Tony");
        assertEquals("Tony", student.getName());
    }

    @Test
    public void getStudentRegNoTest() {
        student.setStudentRegNo("3r234");
        assertEquals("3r234", student.getStudentRegNo());
    }
}