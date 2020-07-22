package com.tonyngeno;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {
    private Teacher teacher = new Teacher();
    private Subject subject = new Subject();

    @Test
    public void getNameTest() {
        teacher.setName("Tony");
        assertEquals("Tony", teacher.getName());
    }

    @Test
    public void getTeacherRegNoTest() {
        teacher.setTeacherRegNo("hg/234");
        assertEquals("hg/234", teacher.getTeacherRegNo());
    }

    @Test
    public void getSubjectTest() {
        subject.setName("Kiswa");
        assertEquals("Kiswa", subject.getName());

    }
}