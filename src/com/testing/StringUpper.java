package com.testing;
public class StringUpper {
    public static void main(String[] args) {

      String input=" sUraj    ratHod  enGNeer  from   iNdia";
      String newString = input.replaceAll("\\s{2,}"," ").trim();
        System.out.println(newString);
        String [] words=newString.split(" ");
        for (String word:words){
            System.out.print(word.substring(0,1).toUpperCase()+word.substring(1,word.length()).toLowerCase()+" ");
        }



    }
}
