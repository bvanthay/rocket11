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
public abstract class User {

    private String name;
    protected double salaryratio;

    public User() {
    }

    public User(String name, double salaryratio) {
        this.name = name;
        this.salaryratio = salaryratio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryratio() {
        return salaryratio;
    }

    public void setSalaryratio(double salaryratio) {
        this.salaryratio = salaryratio;
    }

    public abstract double caluatepay();

    public void displayinfor() {
        System.out.println("name : " + name);
        System.out.println("salary ratio : " + salaryratio);
        System.out.println("caluapay : " + caluatepay());
    }

}
