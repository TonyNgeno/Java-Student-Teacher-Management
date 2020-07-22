package com.tonyngeno;

import java.util.ArrayList;

public class Marks {
    private int score;
    private Subject subject;


    public double getTotalScore(ArrayList<Marks> marks) {
        int totalScore = 0;

        for (Marks marksForSubjects : marks) {
            totalScore = totalScore + marksForSubjects.score;
        }

            return totalScore;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return  "Subject Name:" +this.getSubject() + " " + "Subject Score:" + this.getScore() ;
    }
}
