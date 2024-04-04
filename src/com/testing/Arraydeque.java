package com.testing;

import java.util.ArrayDeque;

public class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();

        ad1.add(8);
        ad1.add(9);
        ad1.addFirst(89);
        ad1.addLast(7);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1);
        System.out.println("The size of arrdeque1 is "+ad1.size());
        
    }
}
