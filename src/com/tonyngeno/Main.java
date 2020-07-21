package com.tonyngeno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Teacher or Student? ");
        System.out.println("1.Choose Student");
        System.out.println("2.Choose Teacher");
        int x = scanner.nextInt();

        if (x == 1){


            //create a list of students
            ArrayList<Student> students = new ArrayList<>();


            //ask for number of students
            System.out.println("Please enter number of students:");
            int n =scanner.nextInt();
            //for condition to check number of students defined
            for (int i = 1; i <= n; i ++) {
                Student student = new Student();
                Subject subject = new Subject();
                Marks mark =new Marks();

                scanner.nextLine();

                System.out.println("Please enter the Student" +i + " " +"Name"+ ":");
                student.setName(scanner.nextLine());

                System.out.println("Please enter the Student Reg Number:");
                student.setStudentRegNo(scanner.nextLine());

                students.add(student);

                System.out.println("Enter No of Subjects Taken:");
                int subjectCount = scanner.nextInt();
                ArrayList<Marks> marks = new ArrayList<>();

                for (int k=1; k <= subjectCount; k++){

                    scanner.nextLine();

                    System.out.println("Please enter Subject " +k + ":");
                    subject.setName(scanner.nextLine());


                    System.out.println("Please enter Score");
                    mark.setScore(scanner.nextInt());
                    mark.setSubject(subject);

                    marks.add(mark);


                }

                System.out.println("---Student Details and Scores---");
                System.out.println("[" + "Name: " + student.getName() + ","+ " " + "Registration Number: " +student.getStudentRegNo()+ "," + " " +subject.getName() + ":" +mark.getScore() + "Total Score:" +mark.getTotalScore(marks) + "]");




            }



        } else if(x == 2){

            //create a list of teachers
            ArrayList<Teacher> teachers = new ArrayList<>();

            //ask for number of teachers
            System.out.println("Please enter number of Teachers:");
            int n =scanner.nextInt();
            //for condition to check number of students defined
            for (int i = 0; i < n; i ++) {
                Teacher teacher = new Teacher();

                ArrayList<Subject> subjects = new ArrayList<>();

                scanner.nextLine();

                System.out.println("Please enter the Student" +i + " " +"Name"+ ":");
                teacher.setName(scanner.nextLine());

                System.out.println("Please enter the Teacher Reg Number:");
                teacher.setTeacherRegNo(scanner.nextLine());

                Subject subject = new Subject();

                System.out.println("Subject You teach:");
                subject.setName(scanner.nextLine());

                teachers.add(teacher);
                subjects.add(subject);


               }

            System.out.println();


        }





    }
}
