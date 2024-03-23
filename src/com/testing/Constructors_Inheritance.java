package com.testing;
class Base{
    Base() {
        System.out.println("I am Constructor of Base Class ");
    }
    Base(int x){
        System.out.println("I am Overloaded Constructor of Base Class with "+ x);
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("I am Constructor of Derived Class ");
    }
    Derived(int x,int y){
        super(x);
        System.out.println("I am Overloaded Constructor of Derived Class with  " +y);
    }
}
class Child extends Derived{
    Child(){
        System.out.println("I am Constructor of Child Class");
    }
    Child(int x,int y, int z){
        super(x, y);
        System.out.println("I am Overloaded class Constructor of Child Class with "+z);
    }
}

public class Constructors_Inheritance {
    public static void main(String[] args) {

       // Base b=new Base();
        //Base b=new Base(5);


      // Derived d=new Derived();
       //Derived d=new Derived(10,5);

        //  Child c=new Child();
        Child c=new Child(10,5,4);
    }
}
