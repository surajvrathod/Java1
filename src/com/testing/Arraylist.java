package com.testing;

//import java.io.*;
import java.util.*;

public class Arraylist{
    public static void main(String[] args)
    {
//        ArrayList <Integer> arr1=new ArrayList<>();
        ArrayList <Integer> l1=new ArrayList<>();
        l1.add(4);
        l1.add(6);
        l1.add(7);
        l1.add(0,9);

        for (int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}
