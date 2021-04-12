package bai9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BUIDINHDAT
 */
public class CPU {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CPU(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CPU{" + "price=" + price + '}';
    }
public class Processor{
    private int coreAmout;

        public Processor(int coreAmout, String menufacturter) {
            this.coreAmout = coreAmout;
            this.menufacturter = menufacturter;
        }
    private String menufacturter;

        public int getCoreAmout() {
            return coreAmout;
        }

        public void setCoreAmout(int coreAmout) {
            this.coreAmout = coreAmout;
        }

        public String getMenufacturter() {
            return menufacturter;
        }

        public void setMenufacturter(String menufacturter) {
            this.menufacturter = menufacturter;
        }
    public float getCate(){
        return 4.3f;
    }
}
   public class Ram{
       private String memory;
       private String menufacturter;

        public Ram(String memory, String menufacturter) {
            this.memory = memory;
            this.menufacturter = menufacturter;
        }

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }

        public String getMenufacturter() {
            return menufacturter;
        }

        public void setMenufacturter(String menufacturter) {
            this.menufacturter = menufacturter;
        }
       public  float getClockpeed(){
           return 5.5f;
       }
   }
}
