package com.testing;

class CWH1 extends Thread{
    public void run(){

//        try {
//            for (int i=0;i<5;i++){
//                System.out.println("Child Thread");
//                Thread.sleep(4000); /* Child thread is put to sleep for 4000ms. As soon as child thread goes to sleep main thread interrupts it. And, InterruptedException is generated which is handled by the catch block. */
//
//            }
//        }
//        catch (InterruptedException e)
        while(true)
        {
            System.out.println("Child Thread Interrupted");
        }
//        System.out.println("Thread is running");
    }
}

public class ThreadMethods extends Thread{
    public static void main(String[] args)  {
        CWH1 t1= new CWH1();
        CWH1 t2= new CWH1();

        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        System.out.println("Main Thread");
    }
}





