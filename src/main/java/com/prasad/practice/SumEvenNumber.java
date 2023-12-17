package com.prasad.practice;

import java.util.Scanner;

public class SumEvenNumber {
    public static void main(String args[]){
        System.out.println("Please enter value :");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++)
            if(i%2==0) {
                sum += i;
                System.out.println("Even number is :"+i);

            }
        System.out.println("Sum Even number is :" + sum);
    }

}
