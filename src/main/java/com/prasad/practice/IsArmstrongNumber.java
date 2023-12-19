package com.prasad.practice;

public class IsArmstrongNumber {
    static int isArmstrong(int num) {
        int rem, result = 0;
        while (num != 0) {
            rem = num % 10;
            result += rem * rem * rem;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Armstrong number is :\n");
        for (int i = 1; i <= 100000; i++) {
            int num = isArmstrong(i);

            if (num == i) {


                System.out.println(i);
            }
        }
    }
}
