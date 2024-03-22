package com.testing;
 //Creating your own class with default access modifier
 class Emplyoee{
     int id;
    String name;
    int salary;
    public void getId(){
        System.out.println("My id is- "+ id);
    }
    public void getName(){
        System.out.println("My name is "+ name);
    }
     public int getSalary(){
         return salary;
     }
}
public class OwnClass {

    public static void main(String[] args) {
        System.out.println("Welcome to Custom Class Lecture");

        Emplyoee suraj=new Emplyoee();//Instantiating the new object from the Employee class
        Emplyoee aditya=new Emplyoee();
        //Setting the Attributes of the object
        suraj.id=13;
        suraj.name="Suraj";
        suraj.salary=30000;
        aditya.name="Aditya";
        aditya.salary=15000;
        //Calling the method
        suraj.getId();
        suraj.getName();
        System.out.println("My salary is "+ suraj.getSalary());

        aditya.getName();
        System.out.println("My salary is "+ aditya.getSalary());
    }
}
