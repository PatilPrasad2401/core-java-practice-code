package com.prasad.practice;

import java.util.Scanner;

public class NegativeFactor {
    static void Negative_factor(int num) {
        for (int i = num; i <= Math.abs(num); ++i) {
            if (i == 0) {
                continue;
            } else {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Negative number :");
        int num = sc.nextInt();
        Negative_factor(num);
    }
}
