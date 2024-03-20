package com.testing;

import java.beans.beancontext.BeanContextChild;

public class Loops {
    public  static  void  main(String[] args){
        System.out.println("Welcome to Loops Class");
        //Loops are used to do repetitive tasks
        //If Else if
        byte a=5;
        if(a%2==0)
            System.out.printf("%d is a even Number",+a);
        else if(a==3)
            System.out.printf("%d is equals 3",+a);
        else
            System.out.println("It's Default case");
        //while loop
        System.out.println("Print 5 to 1 using while loop");
        while(a>0) {
            System.out.println(a);
            a--;
        }
        //do while loop
        System.out.println("Print 0 to 5 using do while loop");
        do {
            System.out.println(a);
            a++;
        }while (a<=5);
        System.out.println("Print 0 to 5 using for loop");
        for (int i=0;i<a;i++)
            System.out.println(i);

    }
}
