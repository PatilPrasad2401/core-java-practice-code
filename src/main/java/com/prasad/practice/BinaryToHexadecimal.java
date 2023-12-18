package com.prasad.practice;

import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String args[]){
        int[] hexa=new int[1000];
        int bin ,dec=0,i=1,rem,j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Pleasa enter Binary number :");
        bin=sc.nextInt();
        while (bin >0){
            rem=bin %2;
            dec=dec +rem * i;
            i=i*2;
            bin /=10;
        }
        i=0;
        while (dec !=0){
            hexa[i]=dec%16;
            dec=dec /16;
            i++;
        }
        System.out.print("HxaDecimal number is :");
        for(j=i-1;j>=0;j--) {
            if (hexa[j] > 9)
                System.out.print((char) (hexa[j] + 55) + "\n");
            else
                System.out.print(hexa[j] + "\n");
        }
    }
}
