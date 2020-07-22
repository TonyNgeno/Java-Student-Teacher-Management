package com.tonyngeno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //take user input

        //list of students
        ArrayList<Student> students= new ArrayList<>();

        // create list of subjects
        ArrayList<Subject> subjects = new ArrayList<>();

        // create list of marks

        ArrayList<Marks> marks = new ArrayList<>();


            Scanner scanner = new Scanner(System.in);
            System.out.println(" Teacher or Student? ");
            System.out.println("1.Choose Student");
            System.out.println("2.Choose Teacher");

            int x = scanner.nextInt();

            if (x == 1){

                //ask for number of students
                System.out.println("Please enter number of students:");
                int n =scanner.nextInt();
                //for condition to check number of students defined
                for (int i = 1; i <= n; i ++) {
                    Student student = new Student();
                    Subject subject = new Subject();
                    Marks mark =new Marks();

                    scanner.nextLine();
                    //ask for student name input
                    System.out.println("Please enter the Student" +i + " " +"Name"+ ":");
                    student.setName(scanner.nextLine());
                    //ask for student registration no input
                    System.out.println("Please enter the Student Reg Number:");
                    student.setStudentRegNo(scanner.nextLine());

                    //add student details to the array list of students
                    students.add(student);

                    //ask for no of subjects student takes
                    System.out.println("Enter No of Subjects Taken:");
                    int subjectCount = scanner.nextInt();


                    //for loop to check on number of subjects stated
                    for (int k=1; k <= subjectCount; k++){

                        scanner.nextLine();

                        //ask for subject name
                        System.out.println("Please enter Subject " +k + " "+"Name"+":");
                        subject.setName(scanner.nextLine());

                        //ask for subject score
                        System.out.println("Please enter Subject Score");
                        mark.setScore(scanner.nextInt());
                        mark.setSubject(subject);

                        //add subject name and scores to marks
                        marks.add(mark);


                    }
                }
                System.out.println("--Student Details---");
                System.out.println(Arrays.toString(students.toArray()));
                System.out.println("--Marks Details---");
                System.out.println(Arrays.toString(marks.toArray()));





            } else if(x == 2){

                //create a list of teachers
                ArrayList<Teacher> teachers = new ArrayList<>();

                //ask for number of teachers
                System.out.println("Please enter number of Teachers:");
                int n =scanner.nextInt();
                //for condition to check number of teachers defined
                for (int i = 1; i <= n; i ++) {
                    //teacher object
                    Teacher teacher = new Teacher();


                    scanner.nextLine();

                    //ask for Teacher Name
                    System.out.println("Please enter the Teacher" +i + " " +"Name"+ ":");
                    teacher.setName(scanner.nextLine());

                    //ask for teacher reg no
                    System.out.println("Please enter the Teacher Reg Number:");
                    teacher.setTeacherRegNo(scanner.nextLine());

                    //subject object
                    Subject subject = new Subject();

                    //ask for subject teacher teaches
                    System.out.println("Subject You teach:");
                    subject.setName(scanner.nextLine());

                    scanner.nextLine();

                    //add teacher detail to teachers array list
                    teachers.add(teacher);

                    //add subject to subjects array list
                    subjects.add(subject);

                    scanner.nextLine();


                }

                System.out.println("--Teachers Details---");
                System.out.println(Arrays.toString(teachers.toArray()));


            }




    }


}

