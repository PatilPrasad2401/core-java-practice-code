package com.prasad.practice.homework;

import java.util.Scanner;

public class Reverse_Number {
    int reversebnumber(int num){
        int result = 0,reminder,i=0;
        while (num>0){
            reminder=num%10;
            result=result *10 +reminder ;
            num/=10;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Reverse_Number rn=new Reverse_Number();
        System.out.println(rn.reversebnumber(num));

    }
}
