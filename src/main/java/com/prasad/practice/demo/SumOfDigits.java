package com.prasad.practice.demo;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String []args){
        System.out.println("Please enter number :");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int num=input;
        int reminder=0;
        int sum=0;
        while (input>0){
            reminder=input%10;
            sum=sum + reminder;
            input /=10;
        }
        System.out.println("The given number is :"+num);
        System.out.println("The sum number is :"+sum);

    }
}
