package com.testing;

import java.util.Date;

public class Datetime {
    public static void main(String[] args) {
        System.out.println("Milli Seconds since 1 Jan 1970 "+System.currentTimeMillis());//Milli Seconds
        System.out.println("Seconds since 1 Jan 1970 "+System.currentTimeMillis()/1000);//seconds
        System.out.println("Hours since 1 Jan 1970 "+System.currentTimeMillis()/1000/3600);//Hour
        System.out.println("Days since 1 Jan 1970 "+System.currentTimeMillis()/1000/3600/24);//Day
        System.out.println("Years since 1 Jan 1970 "+System.currentTimeMillis()/1000/3600/24/365);//Years
        Date d=new Date();
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
    }
}
