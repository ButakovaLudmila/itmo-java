package ru.itmo.java.basics.lab7;

public class Plane {

    class Wing{
        public double weight;

        public void setWeight(double weight) {
            this.weight = weight;
        }
        public void printWeight(){
           Plane.Wing wing =new Plane.Wing();
           System.out.println("Вес крыла самолета: " + weight + " кг.");
       }

    }
    public void innerMethodCall() {
        double a=1666.76;
        double b=1888.98;
        Plane.Wing wing1 = new Plane.Wing();
        wing1.setWeight(a);
        Plane.Wing wing2 = new Plane.Wing();
        wing2.setWeight(b);
        wing1.printWeight();
        wing2.printWeight();
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.innerMethodCall();

    }

}

