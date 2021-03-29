package back;


import entily.Employee;
import entily.Phone;
import entily.vietnamsesphone;
import entily.Manager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class as {
    public void cau1(){
        Phone phone = new  vietnamsesphone();
        phone.instercontact("dat", "0914752999");
        phone.removecontact("dat");
        phone.updatecontact("duc", "0914680888");
        phone.seachcontact("duc");
    }
    
    public  void cau2(){
        Employee employee = new Employee("duc", 7.0);
        employee.displayinfor();
        
        Manager manager = new  Manager("dat", 6.8);
        manager.displayinfor();
    }
}
