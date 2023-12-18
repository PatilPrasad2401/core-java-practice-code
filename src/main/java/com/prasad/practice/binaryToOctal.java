package com.prasad.practice;

import java.util.Scanner;

public class binaryToOctal {
    public static void main(String []args){
        int bin,i=1,j;
        int oct[]=new int[100];
        System.out.println("Please Enter Binary number :");
        Scanner sc=new Scanner(System.in);
        bin=sc.nextInt();
        while(bin !=0){
            oct[i++]=bin%8;
            bin/=8;
        }
        System.out.println("Octal Number is :");
        for (j=i-1;j>0;j--)
            System.out.print(oct[j]);
    }
}
