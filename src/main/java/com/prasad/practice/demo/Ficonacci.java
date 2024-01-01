package com.prasad.practice.demo;

import java.util.Scanner;

public class Ficonacci {
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
        for(int i=0;i<N;i++) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String []args){
        System.out.println("enter number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Fibonacci(num);
    }

}

