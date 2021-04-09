/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import entity.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author BUIDINHDAT
 */
public class Liststudent {

    List<Student> a = new ArrayList<>();

    public void input() {
        a.add(new Student(1, "quang"));
        a.add(new Student(2, "duc"));
        a.add(new Student(3, "trung"));
        a.add(new Student(4, "son"));
        a.add(new Student(5, "loan"));
        a.add(new Student(6, "vui"));
        a.add(new Student(7, "hoa"));
        a.add(new Student(8, "binh"));
    }

    public void show() {
        for (Student student : a) {
            System.out.println(a);
        }
    }

    public void inrastudent() {
        System.out.println("tong so phan tu student" + a.size());

    }

    public void get4sudent() {
        System.out.println("in ra 4 student" + a.get(3));

    }

    public void daucuoi() {
        System.out.println("student dau  " + a.get(0));
        System.out.println("student cuoi" + a.get(a.size() - 1));
    }

    public void addsudent() {
        a.add(new Student(0, "dat"));
        System.out.println("danh sach sau khi them vao vi tri dau");
        show();
    }

    public void add1sudent() {
        a.add(new Student(10, "cong"));
        System.out.println("danh sach sau khi them vao vi tri cuoi  ");
        show();

    }

    public void daonguoc() {
        Collections.reverse(a);
        show();
    }

    public void searchid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id can tim:");
        int id = sc.nextInt();
        for (Student student : a) {
            if (student.getId() == id) {
                System.out.println(student);
            }
        }
    }

    public void searchname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập name cần tìm:");
        String name = sc.nextLine();
        for (Student student : a) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
        }
    }

    public void xoatenid2() {
        for (Student student : a) {
            if (student.getId() == 2) {
                student.setName(null);
            }
        }
        System.out.println("Danh sach student sau khi xoa");
        show();
    }

    public void xoaphantuid5() {
        for (Student student : a) {
            if (student.getId() == 5) {
                a.remove(student);
            }
        }
    }
}
