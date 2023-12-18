package com.prasad.practice;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String args[]){
        long bin ,dec=0,i=1,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Pleasa enter Binary number :");
        bin=sc.nextInt();
        while (bin !=0){
            rem=bin %10;
            dec=dec +rem*i;
            i=i*2;
            bin /=10;
        }
        System.out.println("Decimal Number is :"+dec);
    }
}
