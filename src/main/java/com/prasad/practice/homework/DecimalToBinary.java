package com.prasad.practice.homework;

import java.util.Scanner;

public class DecimalToBinary {
    void decimal_To_Binary(int num){
        int []binary=new int[1000];
        int i=0;
        while (num>0){
            binary[i]=num %2;
            num/=2;
            i++;
        }
        System.out.print("Conversion decimal to binary number is :");
        for (int j=i-1;j>=0;j--)
            System.out.print(binary[j]);
    }
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        DecimalToBinary db=new DecimalToBinary();
        System.out.println("Decimal number is :"+num);
        db.decimal_To_Binary(num);
    }
}
