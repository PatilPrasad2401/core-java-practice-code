package com.prasad.practice.exception;

public class Exception20 {
    static void validate(int age){
        try
        {
            if (age<18)
                throw new ArithmeticException("Invalid Age");
            else
                System.out.println("welcome to vote");
        }catch (NullPointerException e){
            System.out.println("Exception handle :"+e);
        }
        System.out.println("NF1");

    }

    public static void main(String[] args) {
        try{
            validate(13);
        }catch (Exception e){
            System.out.println("papa Handle Exception"+e);
        }
        System.out.println("NF2");
    }
}
