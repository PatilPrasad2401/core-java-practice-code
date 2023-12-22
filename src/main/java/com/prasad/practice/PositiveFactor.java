package com.prasad.practice;

import java.util.Scanner;

public class PositiveFactor {
    static void positive_factor(int num){
        for (int i=1;i<=num;++i){
            if (num%i==0){
                System.out.println(i+ " ");
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        positive_factor(num);
    }
}
