package com.testing;

public class Methods {


  int logic(int a,int b){
        int c;
        if (a>b)
         c=(a+b)*5;
        else
            c=a+b;
        return c;
    }
    public static void main(String[] args){
        System.out.println("Welcome to Methods Class");

        //Calling method using static keyword
        int a=7;
        int b=5;
        //int c=logic(a,b);
        //System.out.println(c);

        int a1=1;
        int b1=2;
        //int c1=logic(a1,b1);
        //System.out.println(c1);


        //Calling Method using object Creation of Class
        Methods obj= new Methods();
        int c2=obj.logic(a,b);
        int c3=obj.logic(a1,b1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
