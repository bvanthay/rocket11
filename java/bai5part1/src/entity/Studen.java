/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Studen extends Person {

    private int masinhvien;
    private int diemtrungbinh;
    private String email;

    public Studen() {
    }

    public Studen(int masinhvien, int diemtrungbinh, String email, String ten, LocalDate ngaysinh, String diachi, Scanner scanner, Gender gender) {
        super(ten, ngaysinh, diachi, scanner, gender);
        this.masinhvien = masinhvien;
        this.diemtrungbinh = diemtrungbinh;
        this.email = email;
    }

    public void setMasinhvien(int masinhvien) {
        this.masinhvien = masinhvien;
    }

    public void setDiemtrungbinh(int diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("nhap ma sinh vien ");
        masinhvien = scanner.nextInt();
        System.out.println("nhap diem trung binh ");
        diemtrungbinh = scanner.nextInt();
        System.out.println("nhap email");
        email = scanner.nextLine();

    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("ma sinh vien : " + masinhvien);
        System.out.println("nhap diem trung binh :" + diemtrungbinh);
        System.out.println("nhap email" + email);

    }

    public boolean diemhocbong() {
        return diemtrungbinh >= 8;
    }

}
