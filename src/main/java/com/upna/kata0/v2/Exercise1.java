/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upna.kata0.v2;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("iker", 6));
        students.add(new Student("pablo", 8));
        students.add(new Student("asier", 2));
        Classroom classroom = new Classroom(students);
        
        List<Student> orderedStundents = classroom.getStudentsOrderedByAscendingGrade();
        StandardOutputPrinter.printStudentsList("Students ordered ascending grades", orderedStundents);
        
        List<Student> studentsBelowMeanScore = classroom.getStudensBelowMeanScore();
        StandardOutputPrinter.printStudentsList("Students below mean score", studentsBelowMeanScore);
    }
}
