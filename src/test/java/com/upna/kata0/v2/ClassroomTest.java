/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upna.kata0.v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author lewricka
 */
public class ClassroomTest {

    @Test
    public void testThereIsNoStudentBelowMeanHavingEmptyClass() {
        List<Student> expectedStudentsBelowMean = Collections.emptyList();

        Classroom classroomWihtoutStudents = new Classroom(Collections.emptyList());
        List<Student> studentsBelowMean = classroomWihtoutStudents.getStudensBelowMeanScore();

        assertEquals(expectedStudentsBelowMean, studentsBelowMean);
    }

    @Test
    public void testThereIsAStudentBelowMean() {
        Student studentAvobeMean1 = new Student("Student 1", 9);
        Student studentAvobeMean2 = new Student("Student 2", 10);
        Student studentBelowMean = new Student("Student 3", 1);
        List<Student> studentList = Arrays.asList(studentAvobeMean1, studentAvobeMean2, studentBelowMean);
        List<Student> expectedStudentBelowMean = List.of(studentBelowMean);

        Classroom classroomWihtoutStudents = new Classroom(studentList);
        List<Student> studentsBelowMean = classroomWihtoutStudents.getStudensBelowMeanScore();

        assertEquals(expectedStudentBelowMean, studentsBelowMean);
    }
    
    @Test
    public void testGetsStudentsOrderedByAscendingGrade() {
        Student student1 = new Student("Student 1", 9);
        Student student2 = new Student("Student 2", 10);
        Student student3 = new Student("Student 3", 1);
        List<Student> studentList = Arrays.asList(student1, student2, student3);
        List<Student> expectedOrderedStudents = Arrays.asList(student3, student1, student2);

        Classroom classroom = new Classroom(studentList);
        List<Student> studentsOrderedByAscendingOrderList = classroom.getStudentsOrderedByAscendingGrade();

        assertEquals(expectedOrderedStudents, studentsOrderedByAscendingOrderList);
    }
}
