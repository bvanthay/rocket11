/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package font;
import bai9.Student;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author BUIDINHDAT
 */
public class test {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        List<Student> a = new ArrayList<>();
          a.add(new Student(1, "nguyen van a"));
        for (Student student : a) {
            System.out.println(student);
        }
    }
    
            
        }
    

