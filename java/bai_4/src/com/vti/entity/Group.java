/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vti.entity;

import java.time.LocalDate;
import java.util.Date;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author ADMIN
 */
public class Group {
    private int id;
    private String GroupName;
    private Account Creator;
    private Account[] accounts;
    private LocalDate createDate;
    
    public Group(){
    }

    public Group(int id, String GroupName, Account Creator, Account[] accounts, LocalDate createDate) {
        this.id = id;
        this.GroupName = GroupName;
        this.Creator = Creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }
    
    
    
    
    public Group(int id, String GroupName, Account Creator,String[] usernames , LocalDate createDate) {
        this.id = id;
        this.GroupName = GroupName;
        this.Creator= Creator;
        
        Account[] accounts = new Account[usernames.length];
      for ( int i = 0; i < usernames.length; i++){
      accounts[i] = new Account(usernames[i]);
    }
      this.createDate = createDate;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public Account getCreator() {
        return Creator;
    }

    public void setCreator(Account Creator) {
        this.Creator = Creator;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

  


            }