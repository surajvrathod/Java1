package com.testing;// User Defined Package for organized group of classes

//Build in Packages or JAVA API
import java.time.Instant;
import java.time.ZoneId;
import java.util.Scanner;
import java.util.Random;
import java.math.MathContext;
import java.time.Clock;
import java.time.MonthDay;
public class Packages {
    public static void main(String[] args) {
       // MonthDay m=new MonthDay(1,2);

        Clock c= new Clock() {
            @Override
            public ZoneId getZone() {
                return null;
            }

            @Override
            public Clock withZone(ZoneId zone) {
                return null;
            }

            @Override
            public Instant instant() {
                return null;
            }
        };

    }
}
