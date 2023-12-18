package com.prasad.practice;

import java.util.Scanner;

public class DecToOcta {
    void DecimalToOctal(int num){
        int[] hexa=new int[100];
        int i=0;
        while(num!=0){
            hexa[i]=num%8;
            num=num/8;
            i++;
        }
        for (int j=i-1;j>=0;j--){

                System.out.print(hexa[j]);
        }
    }
    public static void main(String args[]){
        System.out.println("Enter Decimal Value :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        DecToOcta dec=new DecToOcta();


        dec.DecimalToOctal(num);

    }

}
