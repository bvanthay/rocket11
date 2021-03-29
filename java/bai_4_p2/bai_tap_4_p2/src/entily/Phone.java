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
public abstract class Phone {

    private String[] contact;
    private String number;
    private String name;

    public abstract void instercontact(String name, String phone);

    public abstract void removecontact(String name);

    public abstract void updatecontact(String name, String newphone);

    public abstract void seachcontact(String name);

    public String[] getContact() {
        return contact;
    }

    public void setContact(String[] contact) {
        this.contact = contact;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
