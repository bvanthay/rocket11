/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package font;

/**
 *
 * @author ADMIN
 */
public class bai3 {

    public static void main(String[] args) {
        try {
            int a[] = {1, 2, 3};
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("khong co phan tu nao trong mang");
        }

    }
}
