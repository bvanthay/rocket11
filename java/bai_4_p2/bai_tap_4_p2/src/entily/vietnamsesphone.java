/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entily;

/**
 *
 * @author ADMIN
 */
public class vietnamsesphone extends Phone {

    @Override
    public void instercontact(String name, String phone) {
        System.out.println("chen moi mot lien he" + name + " and  phone" + phone);
    }

    @Override
    public void removecontact(String name) {
        System.out.println(" xoa mot lien he co ten :" + name);
    }

    @Override
    public void updatecontact(String name, String newphone) {
        System.out.println("them moi mot len he :" + name + " so moi " + newphone);
    }

    @Override
    public void seachcontact(String name) {
        System.out.println("tim mot so lien he : " + name + "...");
    }

}
