package com.prasad.practice.demo;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String args[]){
       System.out.println("Please enter octal number :");
        Scanner sc=new Scanner(System.in);
        long oct,dec=0;
        oct=sc.nextInt();
        System.out.println("Octal number is :"+ oct);
        int i =0;
        while (oct!=0)
        {
            dec=(long)(dec +(oct %10) * Math.pow(8 ,i++));
            oct/=10;
        }

        System.out.print("Decimal number is :"+dec);

    }
}
