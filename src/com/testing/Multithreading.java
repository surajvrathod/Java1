package com.testing;
class MyThread1 extends Thread{
    public void run(){
        int i=1;
        while (i<=10) {
            System.out.println(i+" I am Cooking");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=1;
        while(i<=10){
            System.out.println(i+" I am Chatting");
            i++;
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {

        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
t1.start();
t2.start();
    }
}
