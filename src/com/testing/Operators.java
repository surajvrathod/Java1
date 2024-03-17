package com.testing;

import java.util.Random;
import java.util.Scanner;

public class Operators {
    public  static  void main(String[] args){
        System.out.println("Welcome to Operators");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number");
        Double  a=sc.nextDouble();
        System.out.println("Please enter second number");
        Double b= sc.nextDouble();

        // Arithmetic Operators
        System.out.println("The Addition of given two numbers is "+ (a+b));
        System.out.println("The Subtraction of given two numbers is "+ (a-b));
        System.out.println("The Multiplication of given two numbers is "+ (a*b));
        System.out.println("The Division of given two numbers is "+ (a/b));

        //      Assignment Operators = +=
//        Eg. int x=20;
//            int y+=x
//       Comparison Operators == <= >=
//        Eg. a==b,a<=b,a>=b;
//       Logical Operators && || !
//        Eg. condition1 && condition2,
//       Bitwise Operators & |
//        Eg. a&2;a|2;

        //Getting Random  Integer Value
        Random random=new Random();
        int r= random.nextInt(1,10);
        System.out.println("The random value between 1 to 10 is "+r);
//     Format Specifier
//     %d for int
//     %f for float
//     %c for char
//     %s for string
        int d=89;
        float f=329.042f;
        System.out.printf("The value of d is %d and the value of f is %f",d,f);




    }
}
