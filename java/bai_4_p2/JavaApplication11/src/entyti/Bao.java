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
public class Bao extends TaiLieu{
    private int ngayphathanh;

    public Bao() {
    }
            


    public Bao(int ngayphathanh, int matailieu, String tentailieu, int sobanphathanh) {
        super(matailieu, tentailieu, sobanphathanh);
        this.ngayphathanh = ngayphathanh;
    }

    public int getNgayphathanh() {
        return ngayphathanh;
    }
  @Override  
public void inputInfo(){
    Scanner scanner = new Scanner(System.in);
    super.inputInfo();
    System.out.println("ngay phat hanh ");
    ngayphathanh = scanner.nextInt();
    
}
@Override
 public void hienthi(){
     super.hienthi();
     System.out.println(" ngay phat hanh " + ngayphathanh);
 }

   
    
}
