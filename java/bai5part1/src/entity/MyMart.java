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
public class MyMart {
    public int sum(int a ,int b){
        return a + b;
    }
    public int sum(byte a , byte b){
        return (a + b);
    }
    public float  sum(float a ,float b){
        return (a + b );
    }
    public int getArea(int  chieudai, int chieurong){
        return chieudai * chieurong;
    }
    public  int getArea(int canh){
        return (canh * canh);    
    }
    public int getPerimeter(int chieudai , int chieurong){
        return (chieudai + chieurong)*2;
    }
    public int getPerimeter(int canh){
        return canh * 4;
    }
    
}
