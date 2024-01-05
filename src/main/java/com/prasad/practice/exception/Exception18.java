package com.prasad.practice.exception;

public class Exception18 {
    static void validate(int age){
        try
        {
            if (age<18)
                throw new ArithmeticException("Invalid Age");
            else
                System.out.println("welcome to vote");
        }catch (ArithmeticException e){
            System.out.println("Exception handle :"+e);
        }
        System.out.println("NF1");

    }

    public static void main(String[] args) {
        validate(10);
        System.out.println("NF2");
    }
}
