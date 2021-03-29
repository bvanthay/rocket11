/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entyti;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Sach extends TaiLieu {

    private String tentacgia;
    private int sotrang;

    public Sach() {
    }

    public Sach(String tentacgia, int sotrang, int matailieu, String tentailieu, int sobanphathanh) {
        super(matailieu, tentailieu, sobanphathanh);
        this.tentacgia = tentacgia;
        this.sotrang = sotrang;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public int getSotrang() {
        return sotrang;
    }
@Override
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfo();
        System.out.println("ten tac gia ");
        tentacgia = scanner.nextLine();
        System.out.println("so trang ");
        sotrang = scanner.nextInt();

    }
  @Override
    public void hienthi(){
        super.hienthi();
        System.out.println("ten tac gia :" + getTentacgia());
        System.out.println("so trang :" + getSotrang());
    }
  
   
}
