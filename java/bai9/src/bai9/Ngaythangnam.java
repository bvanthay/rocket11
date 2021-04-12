/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

/**
 *
 * @author BUIDINHDAT
 */
public class Ngaythangnam {
    public int ngay, thang, nam;
    public class Giophutgiay{
        public int gio, phut, giay;
        public void xuatthongtin(){
            System.out.println("Ngay : " + ngay + "/" + thang + "/" + nam);
            System.out.println("gio : " + gio + "/" + phut + "/" + giay);
        }
    }
}
