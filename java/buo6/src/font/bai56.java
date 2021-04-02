/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package font;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai56 {

    public static void main(String[] args) {
        while (true) {
            try {
                int age = inputInt();
                System.out.println("tuoi cua ban la " + inputAge(age));
                return;
            } catch (Exception e) {
                System.out.println("tuoi phai lon hon 0");
            }
        }
    }

    public static int inputInt() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("moi ban nhap so");
                int a = sc.nextInt();
                return a;
            } catch (InputMismatchException e) {
                System.out.println("ban phai nhap so");
            }
        }
    }
    public static int inputAge(int age) throws Exception{
        if (age <=0) {
            throw new Exception("tuoi phai lon hon 0");   
        }
        else{
            return age;
        }
    }

}
