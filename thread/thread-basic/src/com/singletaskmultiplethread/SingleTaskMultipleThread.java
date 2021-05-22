package com.singletaskmultiplethread;

public class SingleTaskMultipleThread extends Thread{

    public void run(){
        System.out.println("Task 1");
    }

    public static void main(String... strings){
        SingleTaskMultipleThread thread1 = new SingleTaskMultipleThread();
        thread1.start();

        SingleTaskMultipleThread thread2 = new SingleTaskMultipleThread();
        thread2.start();
    }
}
