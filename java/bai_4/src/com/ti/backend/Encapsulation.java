/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ti.backend;

import com.vti.entity.Student;

/**
 *
 * @author ADMIN
 */
public class Encapsulation {
    public void Question1() {
        float gpa = 1;
        float gpa2 = 9;
        Student student = new Student("bui dinh dat", " ha noi");
        student.setGpa(gpa);
        student.plusGpa(gpa2);
        System.out.println(student);
        
        
         float gpa3 = 2;
        float gpa4 = 1;
        Student student1 = new Student("nguyen trung duc", " lo duc");
        student.setGpa(gpa3);
        student.plusGpa(gpa4);
        System.out.println(student1);
    }
}
