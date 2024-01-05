package com.prasad.practice.exception;

public class Exception12 {
    public static void main(String[] args) {
        System.out.println("s1");
        System.out.println("s2");
        System.out.println("s3");
        System.out.println("s4");
        try{
            int a=10/2;
            System.out.println("10/2 :"+a);
        }
        finally {
            System.out.println("Always Execute!!!");
        }
        System.out.println("s5");
        System.out.println("s6");
        System.out.println("s7");
        System.out.println("s8");
    }
}
