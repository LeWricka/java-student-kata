/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upna.kata0.v2;

import java.util.List;

/**
 *
 * @author lewricka
 */
public class StandardOutputPrinter {
    public static void printStudentsList(String message, List<Student> students){
        System.out.println("\n"+message);
        students.forEach((student) -> System.out.println("Name: "+student.getName()+" Score: "+student.getScore()));
    }
}
