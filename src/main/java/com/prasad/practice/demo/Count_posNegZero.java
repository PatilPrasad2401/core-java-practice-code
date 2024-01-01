package com.prasad.practice.demo;

import java.util.Scanner;

public class Count_posNegZero {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        int c_pos=0,c_neg=0,c_zero=0;
        char choice;
        do{
            System.out.println("Enter values :");
            int input=sc.nextInt();
            if (input>0) {
                c_pos++;
            }
            else if (input<0) {
                c_neg++;
            }
            else {
                c_zero++;
            }
            System.out.println("Do you want to continue y/n?");
            choice = sc.next().charAt(0);
        }while (choice=='y'|| choice=='Y');
        System.out.println("Positive number count is :"+c_pos);
        System.out.println("Negative number count is :"+c_neg);
        System.out.println("Zero number count is :"+c_zero);


    }


}
