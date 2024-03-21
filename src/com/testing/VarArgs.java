package com.testing;

public class VarArgs {

    static int sum(int ...arr){
        //Available as int [] arr;
        int result=0;
        for (int element: arr){
            result+=element;
        }
        return result;
    }
    public static void main(String[] args){
        //Multiple arguments are easily passed using VarArgs

        int a=1,b=2,c=3,d=4,e=5;
        System.out.println("The sum of first two numbers is- "+sum(a,b));
        System.out.println("The sum of first three numbers is- "+sum(a,b,c));
        System.out.println("The sum of first four numbers is- "+sum(a,b,c,d));
        System.out.println("The sum of first five numbers is- "+sum(a,b,c,d,e));
    }


}
