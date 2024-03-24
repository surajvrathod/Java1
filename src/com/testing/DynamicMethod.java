package com.testing;


class Phone1{

    public void showTime(){
        System.out.println("The time is 10 am");
    }
    public void on(){
        System.out.println("The phone is turning on");
    }
}
class Smartphone1 extends Phone1{
    public void music(){
        System.out.println("Playing Music");
    }
    public void on(){
        System.out.println("The Smartphone is turning on");
    }

}
public class DynamicMethod {
    public static void main(String[] args) {
//        Phone1 nokia=new Phone1();//Allowed
//        nokia.showTime();
//        nokia.on();

        //Creating object of Derived class by referring Base class
        //Dynamic Method Dispatch
        Phone1 samsung=new Smartphone1();//Allowed
        samsung.showTime();//method from Base class
        samsung.on();//Overridden method from Derived class
       // samsung.music();//Not allowed because object created with Base reference.

        Smartphone1 poco=new Smartphone1();//Object creation on Derived class by referring Derived class
        poco.on();//All Method Accessible
        poco.music();
        poco.showTime();

    }
}
