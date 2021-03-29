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
public class TapChi extends TaiLieu{
   private  int  sophathanh;
   private  int  ngaythangphathanh;

    public TapChi() {
    }
   

    

    public TapChi(int sophathanh, int ngaythangphathanh, int matailieu, String tentailieu, int sobanphathanh) {
        super(matailieu, tentailieu, sobanphathanh);
        this.sophathanh = sophathanh;
        this.ngaythangphathanh = ngaythangphathanh;
    }

    public int getSophathanh() {
        return sophathanh;
    }

    public int getNgaythangphathanh() {
        return ngaythangphathanh;
    }
    @Override
   public  void  inputInfo(){
       Scanner scanner =new  Scanner (System.in);
       super.inputInfo();
       System.out.println("so phat hanh ");
       sophathanh = scanner.nextInt();
       System.out.println("ngay phat hanh ");
       ngaythangphathanh = scanner.nextInt();
       
   }
   @Override
   public void hienthi(){
       super.hienthi();
       System.out.println("so phat hanh " + sophathanh);
       System.out.println("ngay phat hanh" + ngaythangphathanh);
   }
   
}
