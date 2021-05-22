package com.singletasksinglethread;

public class SingleTaskSingleThread extends Thread{

    public void run(){
        System.out.println("Task 1");
    }

    public static void main(String... strings){
        SingleTaskSingleThread singleTaskSingleThread = new SingleTaskSingleThread();
        singleTaskSingleThread.start();
    }
}
