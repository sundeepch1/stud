package com.multipletaskmultiplethread;

class MyThread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Task 1");
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        System.out.println("Task 2");
    }
}
public class MultipleTaskMultipleThread {

    public static void main(String... strings){
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}
