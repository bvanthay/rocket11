/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package font;

import bai9.Ngaythangnam;

/**
 *
 * @author BUIDINHDAT
 */
public class MainClass {
    public static void main(String[] args) {
        Ngaythangnam date = new Ngaythangnam();
        date.ngay = 31;
        date.thang = 10;
        date.nam = 2017;
        
        Ngaythangnam.Giophutgiay time =   date.new Giophutgiay();
        time.gio = 10;
        time.phut = 15;
        time.giay = 30;
        time.xuatthongtin();
    }
}
