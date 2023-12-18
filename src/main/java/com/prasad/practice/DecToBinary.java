package com.prasad.practice;

import java.util.Scanner;

public class DecToBinary {
    void DecimalToBinary(int num){
        int[] hexa=new int[100];
        int i=0;
        while(num!=0){
            hexa[i]=num%2;
            num=num/2;
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
        DecToBinary dec=new DecToBinary();


        dec.DecimalToBinary(num);

    }

}
