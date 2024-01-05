package com.prasad.practice.exception;

public class exception2 {
    public static void main(String[] args) {
        System.out.println("s1");
        System.out.println("s2");
        System.out.println("s3");
        System.out.println("s4");
        try{
            int i=10/0;
        System.out.println("10/0"+i);
        }catch (ArithmeticException ex){
            System.err.println("error handle "+ex);
        }


        System.out.println("s5");
        System.out.println("s6");
        System.out.println("s7");
        System.out.println("s8");
    }
}
