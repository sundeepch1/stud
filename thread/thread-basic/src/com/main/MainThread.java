package com.main;

class MyThread extends Thread{
    @Override
    public void run(){

        Thread.currentThread().setName("Sundeep");
        System.out.println("Task >>> ");
    }
}

public class MainThread {
    public static void main(String... strings){
/*        System.out.println("In Main");
        System.out.println("Thread Name == " + Thread.currentThread().getName());
        Thread.currentThread().setName("Sundeep");
        System.out.println("Thread Name == " + Thread.currentThread().getName());*/
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("Thread Name == " + thread.getName());
        //thread.setName("Sundeep");
        System.out.println("Thread Name == " + thread.getName());
}
}
