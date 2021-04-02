/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import java.util.Scanner;
import entity.Hinhchunhat;
import entity.HinhVUONG;
/**
 *
 * @author ADMIN
 */
public class tinhhinh {
    public void hinhchunhat(){
        
        Hinhchunhat hcn = new Hinhchunhat() ;
        float a = hcn.tinhchuvi(2 , 6);
        float b =hcn.tinhdientich(6,2);
        System.out.println(a);
        System.out.println(b);
    }
       public  void hinhvuong(){
           HinhVUONG hv = new HinhVUONG();
           float a = hv.dientichinhvuong(7);
           float b = hv.tinhchuvihinhvuong(8);
           System.out.println(a);
           System.out.println(b);
       }
}
