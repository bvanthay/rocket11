/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Student implements IStudent{
    
    private int id;
    private  String name;
    private int group;

    public Student() {
    }

    public Student(int id, String name, int group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }
    
    
    
    
    
    
    

    @Override
    public void diemdanh() {
        System.out.println("diem danh" + name);
    }

    @Override
    public void hocbai() {
         System.out.println("dang hoc  bai" + name );
    }

    @Override
    public void didonvesinh() {
         System.out.println("dang don ve sinh " + name);   
    }
    
}
