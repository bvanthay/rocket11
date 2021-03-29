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
public class TaiLieu {
    
    private int matailieu;
    private String tentailieu;
    private int sobanphathanh;

    public TaiLieu() {
    }

    public TaiLieu(int matailieu, String tentailieu, int sobanphathanh) {
        this.matailieu = matailieu;
        this.tentailieu = tentailieu;
        this.sobanphathanh = sobanphathanh;
    }

    public int getMatailieu() {
        return matailieu;
    }

    public String getTentailieu() {
        return tentailieu;
    }

    public int getSobanphathanh() {
        return sobanphathanh;
    }

  public void inputInfo(){
      Scanner scanner = new  Scanner(System.in);
      System.out.println(" nhap ma tai lieu");
      matailieu = scanner.nextInt();
      scanner.nextLine();
      System.out.println(" nhap ten tai lieu");
      tentailieu = scanner.nextLine();
      System.out.println(" nhap so ban phat hanh");
      sobanphathanh= scanner.nextInt();
      
  }

   public void hienthi(){
       System.out.println("ma tai lieu " + getMatailieu());
       System.out.println("ten tai lieu" + getTentailieu());
       System.out.println("so  phat hanh " + getSobanphathanh());
   }
 
    

    
  
    
}
