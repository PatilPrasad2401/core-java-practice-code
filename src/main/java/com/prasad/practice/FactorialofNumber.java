package com.prasad.practice;

import java.util.Scanner;

public class FactorialofNumber {
    public static void main(String args[])
    {

        int fact=1;
        System.out.println("Please enter value :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=1;i<=num;i++) {
            fact *= i;
        }
        System.out.println("Factorial of given number is :"+fact);
    }
}
