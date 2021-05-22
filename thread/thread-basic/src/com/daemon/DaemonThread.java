package com.daemon;

public class DaemonThread extends Thread{

    @Override
    public void run(){
        System.out.println("Daemon Thread");
    }

    public static void main(String... strings){
        //System.out.println("Main Thread");
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }
}
