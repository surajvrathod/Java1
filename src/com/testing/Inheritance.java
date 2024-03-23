package com.testing;
class Phone{
    //Setting Variables or Properties
    private String name;
    private int ram;
    private int storage;

//Constructor for Base Class
//    public Phone(String name, int ram, int storage) {
//        this.name = name;
//        this.ram = ram;
//        this.storage = storage;
//    }

    //Defining the methods or Functions
    public void dialing() {
        System.out.println("Dialing the numbers");
    }
    public void calling(){
        System.out.println("Calling to peoples");
    }
    public void messege(){
        System.out.println("Messaging the peoples");
    }
    //Setters for Base Class

    public void setName(String name) {
        this.name = name;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    //Getters for Base Class
    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }
}
class Smartphone extends Phone{
    String mainCamera;
    String rearCamera;

    public void setMainCamera(String mainCamera) {
        this.mainCamera = mainCamera;
    }
    public void setRearCamera(String rearCamera) {
        this.rearCamera = rearCamera;
    }

    public String getMainCamera() {
        return mainCamera;
    }

    public String getRearCamera() {
        return rearCamera;
    }

    public Smartphone() {

    }

    public void music(){
        System.out.println("Listening to Music");
    }
    public  void videocall(){
        System.out.println("Communicate with Videocall");
    }
   public void chat(){
       System.out.println("Chatting with peoples");
   }

}
public class Inheritance {
    public static void main(String[] args) {
// Creating Object of Base Class
        System.out.println("Welcome to Base Class Properties and Methods");
        Phone nokia=new Phone();

        nokia.setName("Nokia 1200");
        nokia.setRam(1);
        nokia.setStorage(4);
        System.out.println("Name: "+nokia.getName());
        System.out.println("Ram: "+nokia.getRam());
        System.out.println("Storage: "+nokia.getStorage());


        nokia.dialing();
        nokia.calling();
        nokia.messege();

//  Creating Object of Derived class
        System.out.println();
        System.out.println("Welcome to Derived Class properties and Methods");
       Smartphone samsung=new Smartphone();

       samsung.setName("Samsung Galaxy");
       samsung.setRam(12);
       samsung.setStorage(512);
       samsung.setMainCamera("108 MP");
       samsung.setRearCamera("32 MP");
        System.out.println("Name: "+samsung.getName());
        System.out.println("Ram: "+samsung.getRam());
        System.out.println("Storage: "+samsung.getStorage());
        System.out.println("Main Camera: "+samsung.getMainCamera());
        System.out.println("Rear Camera: "+samsung.rearCamera);

        samsung.dialing();
        samsung.calling();
        samsung.messege();
        samsung.chat();
        samsung.videocall();
        samsung.music();

    }
}
