package com.testing;
class MyTh1 extends Thread{
    MyTh1(String name){
     super(name);
    }
    public void run(){
        int x=0;
        while(x<20) {
            System.out.println(x+" I am Thread1 "+this.getName());
            x++;
        }
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
// Ready Queue: T1 T2 T3 T4 T5
        MyTh1 t1 = new MyTh1("Suraj1");
        MyTh1 t2 = new MyTh1("Suraj2");
        MyTh1 t3 = new MyTh1("Suraj3");
        MyTh1 t4 = new MyTh1("Suraj4");
        MyTh1 t5 = new MyTh1("Suraj5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
