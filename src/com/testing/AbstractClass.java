package com.testing;



abstract class PhoneModel{
    public abstract void switchOn();
    public abstract void cameraModule();
    public abstract void gsmModule();
}

class Redmi extends PhoneModel{

   @Override
    public void switchOn() {
       System.out.println("Redmi Phone switched On");
    }

    @Override
    public void cameraModule() {
        System.out.println("Redmi Camera Design Implemented");
    }

    @Override
    public void gsmModule() {
        System.out.println("Redmi GSM module Implemented");
    }
}
 class Samsung extends PhoneModel{
    @Override
    public void switchOn() {
        System.out.println("Samsung Phone turned on");
    }

    @Override
    public void gsmModule() {
        System.out.println("Samsung GSM module Implemented");
    }

    @Override
    public void cameraModule() {
        System.out.println("Samsung Camera Module Implemented");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        //PhoneModel pm=new PhoneModel();//'PhoneModel' is abstract; cannot be instantiated
        Redmi note3=new Redmi();//New Object Created

        note3.switchOn();
        note3.cameraModule();
        note3.gsmModule();

        Samsung galaxy=new Samsung();

        galaxy.switchOn();
        galaxy.gsmModule();
        galaxy.cameraModule();

        PhoneModel note4=new Redmi();//It is possible to create object of abstract class
        // by referring it to derived class
        note4.switchOn();
        note4.cameraModule();
        note4.gsmModule();
    }
}
