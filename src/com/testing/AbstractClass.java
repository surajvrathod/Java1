package com.testing;



abstract class PhoneModel{
    public abstract void switchOn();
    public abstract void cameraModule();
    public abstract void gsmModule();
}

class Redmi extends PhoneModel{

   @Override
    public void switchOn() {
       System.out.println("Phone switched On");
    }

    @Override
    public void cameraModule() {
        System.out.println("Camera Design Implemented");
    }

    @Override
    public void gsmModule() {
        System.out.println("GSM module Implemented");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        //PhoneModel pm=new PhoneModel();//'PhoneModel' is abstract; cannot be instantiated
        Redmi note3=new Redmi();//New Object Created

        note3.switchOn();
        note3.cameraModule();
        note3.gsmModule();

    }
}
