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
public class Waiter extends User {

    public Waiter(String name, double salaryratio) {
        super(name, salaryratio);
    }

    @Override
    public double caluatepay() {
        return salaryratio * 220;
    }

}
