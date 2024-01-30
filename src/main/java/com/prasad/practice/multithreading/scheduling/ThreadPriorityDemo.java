package com.prasad.practice.multithreading.scheduling;

class SuperManThread extends Thread{
    int superCount=1;
    public void run(){
        System.out.println("Thread SuperManThread Started!!!");
        while (superCount<=3){
            System.out.println("value "+superCount+" in tread supermanThread");
            superCount++;
        }
        System.out.println("Thread superManThread complected...");
    }
}
class BatManThread extends Thread{
    int batCount=1;
    public void run(){
        System.out.println("Thread BatManThread Started!!!");
        while (batCount<=3){
            System.out.println("value "+batCount+" in tread batmanThread");
            batCount++;
        }
        System.out.println("Thread batmanThread complected...");
    }
}
class IronManThread extends Thread{
    int ironCount=1;
    public void run(){
        System.out.println("Thread IronManThread Started!!!");
        while (ironCount<=3){
            System.out.println("value "+ironCount+" in tread ironmanThread");
            ironCount++;
        }
        System.out.println("Thread ironManThread complected...");
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        System.out.println("............Main thread start here..........");
        SuperManThread superManThread=new SuperManThread();
        BatManThread batManThread=new BatManThread();
        IronManThread ironManThread=new IronManThread();
        Thread currentThread=Thread.currentThread();
        System.out.println("Thread name :"+currentThread.getName());
        currentThread.setPriority(Thread.MAX_PRIORITY);
        currentThread.setPriority(Thread.MIN_PRIORITY);
        currentThread.setPriority(Thread.NORM_PRIORITY);
        superManThread.start();
        batManThread.start();
        ironManThread.start();
        System.out.println("............main thread end here...........");

    }
}
