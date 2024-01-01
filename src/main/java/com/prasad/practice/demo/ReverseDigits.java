package com.prasad.practice.demo;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String []args){
        System.out.println("Please enter number :");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int num=input;
        int reminder=0;
        int result=0;
        while (input>0){
            reminder=input%10;
            result=result * 10 + reminder;
            input /=10;
        }
        System.out.println("The given number is :"+num);
        System.out.println("The reverse number is :"+result);

    }
}
