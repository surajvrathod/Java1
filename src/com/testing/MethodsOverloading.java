package com.testing;

public class MethodsOverloading{
    static void change(int x){
        x=98;
    }
    static void change2(int [] marks){
        marks[0]=99;
    }
    static void foo(){
        System.out.println("Calling method with no argument successful");

    }
    static void foo(int x){
        System.out.println("Calling method with single argument successful");
    }
    static  void foo(int x,int y){
        System.out.println("Calling method with Double argument successful");
    }

    public static void main(String[] args) {
        // Case 1:Changing the integer
        int x=45;
        change(x);
        System.out.println(x); // 45
        //Call By Value
        //In case 1 the value of x will not change by calling the method because original integer is being copied
        // any changes done to copied value will not alter the original value

        // Case 2:Changing the array
        int [] marks={45,75,97,46,85};
        change2(marks);
        System.out.println(marks[0]);
        //Call By Reference
        //In case 2 we are not passing actual parameters rather we are passing the reference of the parameters
        // thus any changes done after calling the method will alter the actual values of parameters.

        //Method Overloading-Calling the method with the same name but with different parameters is known as
        //method overloading.
        foo();
        foo(1);
        foo(4,3);
        // Arguments are actual.
    }
}
