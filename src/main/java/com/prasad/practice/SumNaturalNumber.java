package com.prasad.practice;

import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String []args){
        System.out.println("Please Enter Starting number :");
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        System.out.println("Please Enter Last number :");
        int number2=sc.nextInt();
        int sum=0;
        while(number1<=number2)
        {
//            System.out.println("Natural Number is :"+number1);
            sum+=number1;
            number1++;

        }

        System.out.println(sum);


    }
}
