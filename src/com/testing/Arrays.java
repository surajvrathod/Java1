package com.testing;

public class Arrays {
    public static void main(String[] args){
        System.out.println("Welcome to Array class");
        //1.Declaration and then assigning lentgh
        int [] marks;
        marks=new int[4];
        //2.Declaration and assigning length
        int [] marks1=new int[4];
        //3. Declaration assigning and initialize
        int [] marks2={10,20,39,49,38};

        System.out.println("Printing value at index 2 is- "+marks2[2]);
        System.out.println("Total length of array is- "+marks2.length);
        System.out.println("Printng array ");
        for (int i=0;i<marks2.length;i++) {
            System.out.print(marks2[i] + " ");
        }
        System.out.println();
        System.out.println("Printing array in reverse ");
        for (int j=marks2.length-1;j>=0;j--) {
            System.out.print(marks2[j] + " ");
        }
        System.out.println();
        System.out.print("Printing array using for each loop ");
        for (int element:marks2){
            System.out.print(element+" ");
        }


    }
}
