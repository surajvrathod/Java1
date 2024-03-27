package com.testing;
class  Cellphone{
    public void calling(int x){
        System.out.println("Calling..."+ x);
    }
}

interface GPS {
    public void gps();
}
interface Camera1{
    public void capture();
    public void record();
}
interface MediaPlayer{
    public void playMusic();
    public void pauseMusic();
}

class Smartphone2 extends Cellphone implements GPS,Camera1,MediaPlayer{

    @Override
    public void gps() {
        System.out.println("GPS Navigation");
    }

    @Override
    public void capture() {
        System.out.println("Capturing photo with Camera");
    }

    @Override
    public void record() {
        System.out.println("Recording video with Camera");
    }

    @Override
    public void playMusic() {
        System.out.println("Listening music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing Music");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Happy Coding");

        Cellphone cell=new Cellphone();//Used as Cellphone only
        cell.calling(9458922);

        GPS g=new Smartphone2();//Used as GPS only,Dynamic method Dispatch
        //g.calling();//Not Allowed
        g.gps();

        Camera1 cam=new Smartphone2();//Used as Camera Only
       cam.capture();
       cam.record();

       MediaPlayer m=new Smartphone2();//Used as Media Player Only
       m.playMusic();
       m.pauseMusic();

        Smartphone2 s=new Smartphone2();//Can use all the method present at Smartphone class
        s.capture();
        s.gps();
        s.playMusic();
        s.pauseMusic();
        s.calling(928768);
        s.record();
    }
}
