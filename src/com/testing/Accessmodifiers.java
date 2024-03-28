package com.testing;
class C1{
    public int a=5;
    protected int b=8;
    int c=9;
    private int d=4;
public  void meth1(){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

}
}
class  C2 extends C1{

}
public class Accessmodifiers {


//    Access Levels
//    Modifier	Class Package Subclass World
//    public	 Y	     Y	     Y	    Y
//    protected	 Y	     Y	     Y  	N
//    no modifier Y	     Y	     N	    N
//    private	 Y	     N	     N	    N

    public static void main(String[] args) {
C1 c=new C1();
//c.meth1();//within class
        C2 c2=new C2();
       c2.meth1();
        c2.a=2;
        c2.b=0;
        c2.c=1;
        c2.meth1();;
       // c2.d=1;//Private access hence not accessed by subclass


    }
}
