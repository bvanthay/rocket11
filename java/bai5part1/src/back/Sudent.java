/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;
import java.util.ArrayList;
import entity.IStudent;
import entity.Student;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Sudent extends Student{
    private Student[] students;
    
    
    public Sudent(){
        students = new Student[10];
    }
    public  void themhocsinh(){
        Scanner scanner = new  Scanner(System.in);
        students[0]= new Student(1, "dat ", 1);
        students[1] = new Student(2, "duc", 1);
        students[2] = new Student(3, "trung", 1);
        students[3] = new Student(4, "quang", 2);
        students[4] = new Student(5, "son", 2);
        students[5] = new Student(6, "vui", 2);
        students[6] = new Student(7, "loan", 3);
        students[7] = new Student(8, "hoa", 3);
        students[8] = new Student(9, "binh", 3);
        students[9] = new Student(10, "luan", 3);
   
    }
    public void calopdiemdanh()
    {
        for (int i = 0; i < 10; i++) {
              students[i].diemdanh();  
            
            
        }
        
        
    }
    public  void nhomhocbai(){
        for (int i = 0; i <10 ; i++) {
            if (students[i].getGroup()== 2) {
                 students[i].hocbai();
            }
           
        }
    }
    
    public  void donvesinh(){
        for (int i = 0; i < 10; i++) {
            if (students[i].getGroup()==3) {
                 students[10].didonvesinh();  
            }
         
        }
    }
}

