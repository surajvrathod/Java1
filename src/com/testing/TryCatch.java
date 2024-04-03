package com.testing;

public class TryCatch {
    public static void main(String[] args) {
        int a=6000;
        int b=9;
//        int c=a/b;
//        System.out.println(c);

        try {
            int c=a/0;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("We cannot Divide Reason ");
            System.out.println(e);
        }
    }
}
