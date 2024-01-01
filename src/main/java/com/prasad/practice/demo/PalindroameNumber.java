package com.prasad.practice.demo;

import java.util.Scanner;

public class PalindroameNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Negative number :");
        int num = sc.nextInt();
        int result=0,reminder,temp;
        temp=num;
        while(num!=0){
            reminder=num %10;
            result=result *10 +reminder;
            num/=10;
        }
        if (temp == result)
            System.out.println(temp +" is palindrome");
        else
            System.out.println(temp +" is not palindrome");



    }
}
