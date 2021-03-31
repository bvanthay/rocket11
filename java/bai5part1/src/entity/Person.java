/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Gender;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Person {

    private String ten;
    private LocalDate ngaysinh;
    private String diachi;
    private Scanner scanner;
    private Gender gender;

    public Person() {
    }

    public Person(String ten, LocalDate ngaysinh, String diachi, Scanner scanner, Gender gender) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.scanner = scanner;
        this.gender = gender;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(LocalDate ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void input() {
        System.out.println("nhap ten : ");
        ten = scanner.nextLine();
        System.out.println("nhap ngay sinh (yyyy-mm-dd) :");
        ngaysinh = LocalDate.parse(scanner.nextLine());
        System.out.println("nhap gioi tinh (0: nam ; 1: nu ; 2: khong ro");
        int choose = scanner.nextInt();
        switch (choose) {
            case 0:
                gender = Gender.valueOf("nam");
                break;
            case 1:
                gender = Gender.valueOf("nu");
                break;
            case 2:
                gender = Gender.valueOf("khong ro");
                break;
        }

        System.out.println("nhap dia chi : ");
        diachi = scanner.nextLine();
    }

    public void showinfo() {
        System.out.println("ten : " + ten);
        System.out.println("ngay sinh : " + ngaysinh);
        System.out.println("gioi tinh : " + gender);
        System.out.println("dia chi : " + diachi);

    }
}
