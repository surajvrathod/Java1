package com.testing;


import java.util.Scanner;
import java.util.SimpleTimeZone;

public class StringMethods {
    public  static  void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String name=sc.nextLine();
        System.out.println("Welcome to String Methods  Class");
        String name1="Suraj";
        
        System.out.println("Name:- "+name1);
        System.out.println("Length:- "+name1.length());
        System.out.println("Lower class:- "+name1.toLowerCase());
        System.out.println("Upper class:- "+name1.toUpperCase());
        System.out.println("Bytecode- "+name1.getBytes());
        System.out.println("Replacement r with m - "+name1.replace("r","m"));
        System.out.println("Replace All with Rathod- "+name1.replaceAll("Suraj","Rathod"));
        System.out.println("Substring- "+name1.substring(1,3));
        System.out.println("Substring- "+name1.substring(0,3));
        System.out.println("Trim "+name1.trim());
        System.out.println("Starts With S- "+name1.startsWith("S"));
        System.out.println("Ends With S- "+name1.endsWith("S"));
        System.out.println("Equals the Suaj= "+name1.equals("Suaj"));
        System.out.println("Index Of S is "+name1.indexOf('S'));
        System.out.println("Char at 2 is "+name1.charAt(2));
        System.out.println("Last Index of r is "+name1.lastIndexOf('r'));
        System.out.println("Current String is Empty- "+name1.isEmpty());
        System.out.println("Current String is Blank- "+name1.isBlank());
    }

}
