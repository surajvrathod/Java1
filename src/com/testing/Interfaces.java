package com.testing;

interface Display{
    public void displayDesign();
}
interface Camera{
    void cameraDesign();
}
interface Battery{
    void batteryDesign();
}
class Laptop implements Camera,Battery,Display {

    @Override
    public void displayDesign() {
        System.out.println("Display design implemented using interfaces");
    }

    @Override
    public void cameraDesign() {
        System.out.println("Camera design implemented using interfaces");
    }

    @Override
    public void batteryDesign() {
        System.out.println("Battery design implemented using interfaces");
    }
}

public class Interfaces {
    public static void main(String[] args) {
      //Display d=new Display();//Interfaces are similar abstract classes
        // Hence instantiation or object creation is not possible.

        Laptop macbook=new Laptop();//Derived class object created.

        macbook.batteryDesign();
        macbook.cameraDesign();
        macbook.displayDesign();


    }
}
