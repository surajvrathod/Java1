package com.testing;
class Square{
   private int side;
    private int height;
    private  int width;

    //Create new Constructor
    public Square(int side1, int height1,int width1) {
       this.side= side1;
        this.height = height1;
        this.width=width1;
    }

//    public Square() {
//        side=1;
//        height=1;
//    }

    //Create Setters
    public void setSide(int side) {
        this.side = 2;
    }

    public void setHeight(int height) {
        this.height = 2;
    }

    //Creating Getters
    public int getSide() {
        return side;
    }
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int area(){
        return side*side;
    }
    public int volume(){
        return side*height*width;
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        Square sq=new Square(12,11,4);
       // Square sq1=new Square();

        //Setting the values of variables using .method
        //sq.setSide(12);
        //sq.setHeight(10);

//        //Unable to access the .method due to private access modifier
//        System.out.println(sq.height);
//        System.out.println(sq.side);

        System.out.println("The side is "+sq.getSide());
        System.out.println("The height is "+ sq.getHeight());
        System.out.println("The width is "+sq.getWidth());
//        System.out.println(sq1.getSide() );
//        System.out.println(sq1.getHeight());

        System.out.println("The area of square is "+ sq.area());
        System.out.println("The volume of square is "+ sq.volume());


    }
}
