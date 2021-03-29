/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package font;

import back.QLS;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class test {

    public static int Menu() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ THƯ VIỆN");
        System.out.println("1. Thêm tài liệu ");
        System.out.println("2. Xóa tài liệu");
        System.out.println("3. Hiện thị tài liệu");
        System.out.println("4. Tìm kiếm tài liệu");
        System.out.println("0. Thoát");
        System.out.println("=====================");
        n = sc.nextInt();
        return n;
    }

    public static void main(String[] args) {
        QLS qltl = new QLS();
        int chon;
        do {
            chon = Menu();
            switch (chon) {
                case 1:
                    qltl.addtailieu();
                    System.out.println("Thêm Thành Công");
                    break;
                case 2:
                    qltl.XOA();
                    System.out.println("xoa thanh cong");
                    break;
                case 3:
                    qltl.hienthi();
                    break;
                case 4:
                    qltl.timkiem();
                    break;
                case 5:
                    System.out.println("nhap sai ! moi nhap lai ! ");
                default:

                    break;
            }
        } while (chon != 0);
        System.out.println("Kết thúc chương trình ");
    }

}
