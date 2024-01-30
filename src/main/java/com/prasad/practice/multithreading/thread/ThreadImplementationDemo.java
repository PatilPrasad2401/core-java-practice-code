package com.prasad.practice.multithreading.thread;

class MyThread extends Thread{
    public void run(){
        try {
//            displying thread that is running...
            System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
        }catch (Exception ex){
            System.out.println("exception is caught" +ex.getMessage());
        }
    }
}
public class ThreadImplementationDemo {
    public static void main(String[] args) {
        System.out.println("Demonstration of thread by extending thread by  stats here ");
        int n=10;
        for (int i=0;i<n;i++){
            MyThread thread=new MyThread();
            thread.start();
        }
    }
}
