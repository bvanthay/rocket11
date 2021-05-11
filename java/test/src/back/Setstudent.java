/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import entity.Student;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author BUIDINHDAT
 */
public class Setstudent {
    Set<Student> a = new HashSet<Student>();

	public void input() {
		a.add(new Student(1, "duc"));
		a.add(new Student(2, "Dat"));
		a.add(new Student(3, "duc"));
		a.add(new Student(4, "Vui"));
		a.add(new Student(5, "Cuong"));
		a.add(new Student(6, "vui"));
		a.add(new Student(7, "Cuong"));
		a.add(new Student(8, "quang"));
		a.add(new Student(9, "Cuong"));
		a.add(new Student(10, "quang"));
	}

	public void show() {
		for (Student student : a) {
			System.out.println(student);
		}
	}

	
	public void printStudent() {
		System.out.println("Tong so phan tu cua mang:" + a.size());
	}

	
	public void get4Student() {
		Iterator<Student> iterator = a.iterator();
		for (int i = 0; i < 1; i++) {
			iterator.next();
		}
		System.out.println("Student thu 4:" + iterator.next());
	}

	
	public void daucuoi() {
		Iterator<Student> iterator = a.iterator();
		System.out.println("Student dau tien:" + iterator.next());
		for (int i = 0; i < a.size() - 2; i++) {
			iterator.next();
		}
		System.out.println("Student cuoi cung la:" + iterator.next());
	}

	
	
	
}

