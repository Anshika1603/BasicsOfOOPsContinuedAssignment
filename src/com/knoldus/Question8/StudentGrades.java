package com.knoldus.Question8;

import java.util.Arrays;

public class StudentGrades {
    private char[] grades;

    public StudentGrades(char[] initialGrades) {
        grades = initialGrades;
    }

    // Getter method to access the grades
    public char[] getGrades() {
        return grades;
    }

    // Setter method to modify the grades
    public void setGrades(char[] newGrades) {
            grades = newGrades;

    }

    public static void main(String[] args) {
        StudentGrades studentGrades=new StudentGrades(new char[]{'A', 'B', 'A'});
        System.out.println("Initial Grades: "+Arrays.toString(studentGrades.getGrades()));
        studentGrades.setGrades(new char[]{'A', 'B', 'B'});
        System.out.println("New Grades: "+Arrays.toString(studentGrades.getGrades()));



    }
}

