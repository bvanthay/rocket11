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
public class bai4 {
    public static void main(String[] args) {
        try {
            String department[]={"departmen1","department2","department3"};
            getIndex(department);
        } catch (Exception e) {
            System.out.println("khong tim phan tu nao trong mang");
        }
    }

    private static void getIndex(String[] department) throws Exception {
        int index = 5;
        if (index > department.length){
            throw new Exception("khong tim thay phan tu nao trong mang");
        }
    }
}
