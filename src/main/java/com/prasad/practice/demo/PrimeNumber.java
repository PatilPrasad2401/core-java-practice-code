package com.prasad.practice.demo;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Please Enter Number :");
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int i=2;
        int count=0;
        while(i<=n/2) {
            if (n % i == 0) {
                count++;
                break;
            }
            i++;
        }
        if(count==0)
            System.out.println(n+" is Prime Number");
        else
            System.out.println(n+"is not prime number");

    }
}
