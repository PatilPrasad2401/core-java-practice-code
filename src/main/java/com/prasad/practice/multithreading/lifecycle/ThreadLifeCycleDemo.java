package com.prasad.practice.multithreading.lifecycle;
class BlueThread implements Runnable{
    public void run() {
//        moving thread2 to timed waitting state

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        System.out.println("State of whiteThread is calling join() method on lightBlueThread: "+ThreadLifeCycleDemo.whiteThread.getState());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }
}

public class ThreadLifeCycleDemo implements Runnable {
    public static Thread whiteThread;
    public static ThreadLifeCycleDemo threadLifeCycleDemo;
    public static void main(String[] args) {
        threadLifeCycleDemo =new ThreadLifeCycleDemo();
        whiteThread=new Thread(threadLifeCycleDemo);
//        whiteThread created and is in new state
        System.out.println("State of whiteThread after creating it :"+whiteThread.getState());
        whiteThread.start();
//        whiteThread move to runnable state
        System.out.println("state of whiteThread after calling .start() method on it :"+whiteThread.getState());


    }
    public void run() {
        BlueThread blueThread=new BlueThread();
        Thread lightBlueThread=new Thread(blueThread);
        System.out.println("state of lightBlueThread after creating .Start() method on it :"+lightBlueThread.getState());
        lightBlueThread.start();

        System.out.println("state of whiteThread after calling .Start() method on it :"+lightBlueThread.getState());
//            moving whiteThread to timerd state
        try {
//            moving thread1 to timerd state
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println("state of lightBlueThread after calling .sleep() method on it"+lightBlueThread.getState());
        try {
//            waiting for lightBlueThread die
            lightBlueThread.join();
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println("state of lightBlueThread when it has finished it's execution"+lightBlueThread.getState());
    }
}