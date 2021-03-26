/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vti.entity;

/**
 *
 * @author ADMIN
 */
public class Department {
    int id;
    String name;
    
    public Department(){
        
    }

    public Department(int id, String name) {
        this.id = 0;
        this.name = name;
    }


    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String result = "";
        result +="id:" + id +"\n";
        result += "name: " + name + "\n";
             return  result;
    }

}
    

