package com.prasad.practice;

import java.util.Scanner;

public class SumOddNumber {
    public static void main(String args[]){
        System.out.println("Please enter value :");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++)
            if(i%2!=0) {
                sum+=i;
                System.out.println("Odd number is :" + i);
            }
            System.out.println("Sum Even number is :" +sum);
    }
}
