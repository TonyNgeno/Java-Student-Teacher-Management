package com.tonyngeno;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarksTest {
    private Marks marks = new Marks();
    private Subject subject = new Subject();

    @Test
    public void getTotalScoreTest() {

    }

    @Test
    public void getScoreTest() {
        marks.setScore(23);
        assertEquals(23, marks.getScore());
    }

    @Test
    public void getSubjectTest() {
        subject.setName("Kiswa");
        assertEquals("Kiswa", subject.getName());

    }
}