package com.testing;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b,reverse=0;
        while(a>0){
            b=a%10; //Returns 123 3
            reverse=reverse*10+b;
            System.out.println(b);
            a=a/10;  //Returns 123 12
        }
        System.out.println("Reversed Number is- "+ reverse);
    }

}
