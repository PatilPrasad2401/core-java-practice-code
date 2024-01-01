package com.prasad.practice.demo;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String args[]){
        System.out.println("Please enter value :");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=1;i<=num;i++)
            if(i%2==0)
                System.out.println("Even number is :"+i);

    }
}
