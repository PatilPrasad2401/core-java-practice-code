package com.prasad.practice.demo;

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String args[]){
       System.out.println("Please enter octal number :");
        Scanner sc=new Scanner(System.in);
        int oct=sc.nextInt();
        System.out.println("Octal number is :"+ oct);
        int dec=0,n =0;
        while (oct>0)
        {
            int temp=oct % 10;
            dec +=temp *Math.pow(8 , n);
            oct/=10;
            n++;
        }
        int bin[]=new int[20];
        int i=0;
        while (dec>0)
        {
            int r=dec%2;
            bin[i++]=r;
            dec/=2;
        }
        System.out.print("Binary number is :");
        for (int j=i-1;j>=0;j--)
            System.out.print(bin[j]+"");
    }
}
