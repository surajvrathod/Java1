package com.testing;

class MyRunnableThread1 implements Runnable{
          public void run(){
              int i=1;
     while(i<100){
        System.out.println(i+" I am Runnable Thread 1");
        i++;
     }
}}
class  MyRunnableThread2 implements Runnable{
    public void run(){
        int i=1;
        while(i<100){
            System.out.println(i+" I am Runnable Thread 2 ");
            i++;
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {

MyRunnableThread1 bullet1=new MyRunnableThread1();
Thread gun1= new Thread(bullet1);
MyRunnableThread2 bullet2=new MyRunnableThread2();
Thread gun2=new Thread(bullet2);

//bullet1.run();//Traditional Method of Running Threads i.e.Seriallly
//bullet2.run();

//bullet1.start();//Cannot run

        gun1.start();
        gun2.start();

    }
}
