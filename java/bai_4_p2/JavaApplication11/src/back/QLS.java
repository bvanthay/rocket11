/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import entyti.Bao;
import entyti.Sach;
import entyti.TapChi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entyti.TaiLieu;

/**
 *
 * @author ADMIN
 */
public class QLS {

    private List<TaiLieu> tl;
    private Scanner scanner;

    public QLS() {
        tl = new ArrayList<TaiLieu>();
        scanner = new Scanner(System.in);
    }

    public void addtailieu() {
        TaiLieu taiLieu = new TaiLieu();
        System.out.print("ban muon chon tep nao (1 : sach , 2 : bao , 3: tap chi)");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                taiLieu  = new Sach();
                taiLieu.inputInfo();// nhap tai lieu va hien ra 
                tl.add(taiLieu);
                break;
            case 2:
                taiLieu  = new Bao();
                taiLieu.inputInfo();// nhap tai lieu va hien ra 
        tl.add(taiLieu);
                break;
            case 3:
                taiLieu = new TapChi();
                taiLieu.inputInfo();// nhap tai lieu va hien ra 
        tl.add(taiLieu);
                System.out.println(" them thanh cong ");
                break;
            default:
                break;

        }
        System.out.println(" them thanh cong ");
    }

    public void XOA() {
        int matailieu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ma tai lieu can xoa ");
        matailieu = scanner.nextInt();
        for (TaiLieu lieu : tl) {
            if (matailieu == lieu.getMatailieu()) {
                tl.remove(lieu); // xoa tai lieu theo ma tai lieu
            }

        }
    }

    public void hienthi() {
        for (TaiLieu lieu : tl) {
            lieu.hienthi();// goi hien thi thong tin tai lieu len 

        }
    }

    public void timkiem() {
        int matailieu;
        
        int choose;
        System.out.println("ban muon tim kiem tai lieu nao (1 : sach , 2 : bao , 3: tap chi)   ");
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
                for (TaiLieu lieu : tl) {
                    if (lieu instanceof Sach) {
                        lieu.hienthi();
                    }
                }
                break;
            case 2:
                for (TaiLieu lieu : tl) {
                    if (lieu instanceof Bao) {
                        lieu.hienthi();
                    }
                }
                break;
            case 3:
                for (TaiLieu lieu : tl) {
                    if (lieu instanceof TapChi) {
                        lieu.hienthi();
                    }
                }
                break;
            default:
                System.out.println("nhap sai");
                break;
        }
    }
}
