package com.prasad.practice.demo;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String []args){
        System.out.println("Please Enter Starting number :");
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        System.out.println("Please Enter Last number :");
        int number2=sc.nextInt();
        while(number1<=number2)
        {
            System.out.println("Natural Number is :"+number1);
            number1++;
        }

    }
}
