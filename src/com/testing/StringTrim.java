package com.testing;

public class StringTrim {
    public static void main(String[] args){
        System.out.println("Convert First letter as Uppercase");
        String actual="I am     suraj  rathod";
        System.out.println(actual);
        String replaced=actual.replaceAll("\\s{1,} "," ").trim();
        System.out.println(replaced);
        String[] words=replaced.split(" ");
        for (String word:words){
            System.out.print(word.substring(0,1).toUpperCase()+word.substring(1,word.length())+" ");
        }

    }
}
