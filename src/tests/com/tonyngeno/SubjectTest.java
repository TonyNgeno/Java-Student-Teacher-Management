package com.tonyngeno;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubjectTest {
    private Subject subject = new Subject();

    @Test
    public void getNameTest() {
        subject.setName("English");
        assertEquals("English", subject.getName());


    }
}