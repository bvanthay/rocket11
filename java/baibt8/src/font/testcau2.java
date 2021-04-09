/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package font;

import java.util.Stack;
import entity.Student;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author BUIDINHDAT
 */
public class testcau2 {

    public static void main(String[] args) {
        Stack<Student> a = new Stack<>();
        a.push(new Student(1, "Nguyen van nam"));
        a.push(new Student(2, "nguyen van huyen"));
        a.push(new Student(3, "tran van nam "));
        a.push(new Student(4, "nguyen van a"));

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.pop());

        }

    }

    public static void Queue() {
        Queue<Student> a = new LinkedList<>();
        a.add(new Student(1, "Nguyen van nam"));
        a.add(new Student(2, "nguyen van huyen"));
        a.add(new Student(3, "tran van nam "));
        a.add(new Student(4, "nguyen van a"));

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.poll());
        }
    }
   
}
