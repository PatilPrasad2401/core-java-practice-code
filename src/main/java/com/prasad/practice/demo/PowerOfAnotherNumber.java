package com.prasad.practice.demo;

import java.util.Scanner;

public class PowerOfAnotherNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Base  Number :");
        int base=sc.nextInt();
        System.out.println("Please enter Power Number :");
        int power=sc.nextInt();
        int result=1;
        for (int i=1;i<=power;i++)
            result *=base;
        System.out.println(result);
    }
}
