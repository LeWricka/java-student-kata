/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, chooseRu Tools | Templates
 * and open the template in the editor.
 */
package com.upna.kata0.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author lewricka
 */
public class Classroom{
    private List<Student> students;

    public Classroom(List<Student> students) {
        this.students = students;
    }
    
    public List<Student> getStudensBelowMeanScore(){
        return this.students
                .stream()
                .filter(student -> student.getScore() < this.getAverageScore())
                .collect(Collectors.toList()
                );
    }
    
    public List<Student> getStudentsOrderedByAscendingGrade(){
        List<Student> orderedStudents = this.students;
        orderedStudents.sort((Student student1, Student student2) -> {
            if (student1.getScore() > student2.getScore()) {
                return 1;
            }
            if (student1.getScore() < student2.getScore()) {
                return -1;
            }
            return 0;
        });
        
        return orderedStudents;
    }
    
    private double getAverageScore(){
        double totalScore = 0;
        for(Student student :students) {
            totalScore += student.getScore();
        };
        
        return totalScore/students.size();
    }    
}




