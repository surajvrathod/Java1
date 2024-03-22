package com.testing;
class Emplyoee1{


    public Emplyoee1(){
        id=24;
        name="Rathod";
        salary=28090;
    }
    public Emplyoee1(int x){
        id=x;
        name="Rathod";
        salary=28090;
    }


   private int id;
    String name;
    int salary;
    public void getId(){
        System.out.println("My id is- "+ id);
    }
    public void setId(int x){
        id=x;
    }
    public void getName(){
        System.out.println("My name is "+ name);
    }
    public void getSalary(){
        System.out.println("My salary is "+ salary);
    }
}
public class Constructors {
    public static void main(String[] args) {
        Emplyoee1 suraj=new Emplyoee1();
        Emplyoee1 suraj1=new Emplyoee1(10);


        //suraj.id=29; Unable to set value by .set method due to private access modifier
        //suraj.setId(20);//Setting the Id using Setter Method
       // suraj.getId();  //getting the Id using getter Method
        //Setting and Getting Values for Multiple objects becomes hectic
        // to call methods Multiple times Hence we use Constructors

        //Method Overloading is possible similar to normal methods
        //By Passing Different arguments for methods
suraj.getId();
suraj.getName();
suraj.getSalary();
suraj1.getId();
    }
}
