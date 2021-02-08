/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upna.kata0.v1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("iker", 6));
        students.add(new Student("pablo", 8));
        students.add(new Student("asier", 2));
        double averageScore = 0;
        
        for(Student student :students) {
            averageScore += student.getScore();
        };
        
        final double average = averageScore/students.size();
        
        students.sort((Student student1, Student student2) -> {
            if (student1.getScore() > student2.getScore()) {
                return 1;
            }
            if (student1.getScore() < student2.getScore()) {
                return -1;
            }
            return 0;
        });
        
        System.out.println("\nOrdered by score:");
        students.forEach((student) -> System.out.println(student.getName()));
        
        System.out.println("\nOver mean:");
        students.forEach((student) -> {
            if (student.getScore() >= average) {
                System.out.println(student.getName());
            }
        });
    }
}
