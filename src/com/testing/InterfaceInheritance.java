package com.testing;
interface Sample{
    public void meth1();
    public void meth2();
}
interface Child1 extends Sample{
    public void meth3();
}
class Simple implements Child1{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        System.out.println("Happy Coding");

        Simple s1=new Simple();
         s1.meth1();
         s1.meth2();
         s1.meth3();
    }

}
