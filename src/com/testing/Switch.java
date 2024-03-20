package com.testing;

import java.util.Scanner;

public class Switch {
    public  static void main(String[] args){
        System.out.println("Welcome to Switching Classes");
        System.out.println("Please Enter a number betweeen 1 to 10");
        Scanner sc=new Scanner(System.in);
        byte num=sc.nextByte();
        switch (num) {
            case 1:System.out.println("You've entered 1 ");
            break;
            case 2:System.out.println("You've entered 2 ");
            break;
            case 3:System.out.println("You've entered 3 ");
            break;
            case 4:System.out.println("You've entered 4 ");
            break;
            case 5:System.out.println("You've entered 5 ");
            break;
            default:
                System.out.println("This is default case");
        }
    }
}
