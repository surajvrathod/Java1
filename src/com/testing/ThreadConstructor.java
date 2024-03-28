package com.testing;
class MyTh1 extends Thread{
    MyTh1(String name){
     super(name);
    }
    public void run(){
        int x=0;
        while(x<20) {
            System.out.println("I am Thread1");
            x++;
        }
    }
}
class  MyTh2 extends  Thread{
    MyTh2(){

    }
}
public class ThreadConstructor {
    public static void main(String[] args) {
MyTh1 t1=new MyTh1("Suraj");
t1.start();
        System.out.println(t1.getName());
        System.out.println(t1.threadId());
    }
}
