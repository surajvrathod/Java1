package com.testing;

public class Recursion {
    //Method calling itself again and again
    // Recursive approach to calculate the factorial of n numbers

    static int factorial(int x){
        if (x==0 || x==1)
            return 1;
        else
            return x*factorial(x-1);
    }

    static int rec_fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
        // Recursive call
        else
        return ((rec_fib(n-1) + rec_fib(n - 2)));
    }
    // Iterating the course of action using loops
    //Iterative Approach to calculate the factorial
    static int iterative_factorial(int x){
        int product=1;
        if (x==0 || x==1)
            return x;
        else
            for(int i=1;i<=x;i++)
                product*=i;
        return product;
    }
    //Iterative ite_fib Series
    static  void ite_fib(int x){
        int first=0; int second=1;
        int third=1;
        System.out.println("Fibonacci series using Iteration");
        for (int i = 0; i <x; i++) {

            System.out.print(first+" ");

            //Swapping
            third = first + second;
            first = second;
            second = third;

            third = first + second;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("The factorial of number is  "+factorial(n));
        System.out.println("The factorial of number is  "+iterative_factorial(n));

        ite_fib(10);


        System.out.println("Fibonacci series using Recursion");
        for (int i=0;i<10;i++){
            System.out.print(rec_fib(i)+" ");
        }

    }
}
