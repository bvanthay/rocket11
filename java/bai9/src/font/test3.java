/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package font;
import bai9.CPU;
import bai9.Car;
/**
 *
 * @author BUIDINHDAT
 */
public class test3 {
    public void cau1(){
        CPU a = new CPU(14);
        CPU.Ram b = a.new Ram("16", "sony");
        CPU.Processor c = a.new Processor(8,"asus");
        System.out.println(b.getClockpeed()+":"+c.getCate());
        
        
    }
    public void cau2(){
    Car a = new Car("audi", "the thao");
    Car. engine b = a.new engine("audi");
        System.out.println(a+ ":" + b.getEngineType());
}
    
    public static void main(String[] args) {
        test3 d = new test3();
        d.cau1();
        d.cau2();
        
    }
}
