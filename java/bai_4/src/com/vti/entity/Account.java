/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vti.entity;


import java.util.Date;


/**
 *
 * @author ADMIN
 */
public class Account {
    private  int id;
    private String Email;
    private String Username;
    private String FullName;
    private Position position;
    private Gender gender ;
    private Date CreateDate;
    private Department  Department;
    private Group[] groups;
    
    public  Account(){
        
    }

    public Account(int id, String Email, String Username, String firstName, String lastName) {
        this.id = id;
        this.Email = Email;
        this.Username = Username;
        this.FullName = firstName+""+lastName ;  
    }
      public Account(int id, String Email, String Username, String firstName, String lastName, Position position) {
        this.id = id;
        this.Email = Email;
        this.Username = Username;
        this.FullName = firstName+""+lastName ;
        this.position = position;
        this.CreateDate = new Date();
}
          public Account(int id, String Email, String Username, String firstName, String lastName, Position position,Date CreateDate ) {
        this.id = id;
        this.Email = Email;
        this.Username = Username;
        this.FullName = firstName+""+lastName ;
        this.position = position;
        this.CreateDate = new Date();   
}
          public Account (String Username){
              this.Username = Username;
          }

   

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", Email=" + Email + ", Username=" + Username + ", FullName=" + FullName + ", position=" + position + ", gender=" + gender + ", CreateDate=" + CreateDate + ", Department=" + Department + ", groups=" + groups + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date CreateDate) {
        this.CreateDate = CreateDate;
    }

    public Department getDepartment() {
        return Department;
    }

    public void setDepartment(Department Department) {
        this.Department = Department;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
          
          
}