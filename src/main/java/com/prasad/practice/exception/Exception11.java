package com.prasad.practice.exception;

public class Exception11 {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Going to divide :");
                int b=30/0;
                System.out.println(b);
            }catch (NumberFormatException e){
                System.err.println("error1 :"+e);
            }
            System.out.println("NF1");
            try{
                System.out.println("Going to array operation :");
                int []arr=new int[5];
                arr[5]=4;
            }catch (NullPointerException e){
                System.err.println("error2 :"+e);
            }
            System.out.println("NF2");
        }catch (NullPointerException e){
            System.err.println("Parent Exception :"+e);
        }
        System.out.println("Normal folw...");
    }
}
