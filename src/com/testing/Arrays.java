package com.testing;

public class Arrays {
    public static void main(String[] args){
        System.out.println("Welcome to Array class");
        //1.Declaration and then assigning lentgh
        int [] marks;
        marks=new int[4];
        //2.Declaration and assigning length
        int [] marks1=new int[4];
        //3. Declaration assigning and initialize
        int [] marks2={10,20,39,49,38};

        System.out.println("Printing value at index 2 is- "+marks2[2]);
        System.out.println("Total length of array is- "+marks2.length);
        System.out.println("Printng array ");
        for (int i=0;i<marks2.length;i++) {
            System.out.print(marks2[i] + " ");
        }
        System.out.println();
        System.out.println("Printing array in reverse ");
        for (int j=marks2.length-1;j>=0;j--) {
            System.out.print(marks2[j] + " ");
        }
        System.out.println();
        System.out.print("Printing array using for each loop ");
        for (int element:marks2){
            System.out.print(element+" ");
        }

        //Multidimentional Arrays
        //2D arrays
        System.out.println();
        System.out.println("Multidimentinal Array");
        int [] []flats=new int[2] [3];
        flats [0][0]=101;
        flats [0][1]=102;
        flats [0][2]=103;
        flats [1][0]=201;
        flats [1][1]=202;
        flats [1][2]=203;
        System.out.println(flats[1][2]);
        System.out.println("Length of Rows are "+flats.length);
        System.out.println("Length of Columns are "+flats[0].length);
        for (int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
        }

    }
}
