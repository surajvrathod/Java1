package com.testing;

//import java.io.*;
import java.util.*;

public class Arraylist{
    public static void main(String[] args)
    {
//        ArrayList <Integer> arr1=new ArrayList<>();
        ArrayList <Integer> l1=new ArrayList<>();
        ArrayList <Integer> l2=new ArrayList<>(3);
        l2.add(6);
        l2.add(5);

        l1.add(4);
        l1.add(6);
        l1.add(7);
        l1.add(0,9);
        //l1.clear();
        System.out.println( l1.contains(5));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(7));
        System.out.println(l1.get(1));

        System.out.println("The size of l1 array is "+l1.size());
        System.out.println("The size of l2 array is "+l2.size());
        for (int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }

    }
}
