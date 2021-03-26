/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ti.backend;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Contructor {

    
public  void  question1(){
   Department department = new  Department();
    System.out.println(department);
    
    Department department1 = new  Department(1, "sale");
   System.out.println(department1);
}
    //bai 2 
    public  void question2(){
  Account account = new Account();
  System.out.println(account);
   
   
   
    Account account1 = new Account(1, "taikhoan1@gmail.com", "buidinhdat11", "dinh dat", "bui");
        System.out.println(account1);
        
        
        Position position1 =new Position(1,"sale");
        Position position2 =new Position(2, "Marketing ");
        Account account2 = new Account(2, "taikhoan2@gmail.com", "buidinhdat12", "bui dinh", "dat", position1);
        System.out.println(account2);
        
       
       Account account3 = new  Account(3, "taikhoan3@gmail.com", "buidinhdat12", "bui dinh", "dat", position2);
        System.out.println(account3);
        
        
    } 
    public void question3(){
        Group group = new Group();
        System.out.println(group);
                
    Account creator =new Account(1, "buidinh@gmail.com", "buidinhdat14", "buidinh", "dat");
    Account account1 = new Account(2, "buidinh2@gmail.com", "buidinhdat15", "buidinh", "dat");
    Account account2 = new Account(3, "buidinh3@gmail.com", "buidinhdat16", "buidinh", "dat");
    Account[] accounts={creator,account1,account2};
    Group group1 = new Group(1, "sale", creator, accounts, LocalDate.parse("2020-02-18"));
        System.out.println(group1);
    
    String[] usernames= { "buidinhdat1","buidinhdat2","buidinhdat3"};
        System.out.println(group1);
        Group group2 = new Group(1, "abc", creator, usernames, LocalDate.parse("2020-05-14"));
        System.out.println(group2);   
    }
}
