/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

/**
 *
 * @author BUIDINHDAT
 */
public class Student {
   public static int cout = 0 ;
    
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = cout;
        this.name = name;
        cout++;
    }

    public static int getCout() {
        return cout;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * @deprecated replaced by {@link #getidnew}}
     */
    public  int getid(){
       return this.id;
        
}
    public  String getidnew (){
        String result = "mssv : " + this.id;
      return result; 
    }
}
