package com.prasad.practice;

import java.util.Scanner;

public class LargestAndSmallestNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        char choice;
        do{
            System.out.println("Enter values :");
            int input=sc.nextInt();
            if (input > max) {
                max=input;
            }
            if (input < min) {
                min = input;
            }

            System.out.println("Do you want to continue y/n?");
            choice = sc.next().charAt(0);
        }while (choice=='y'|| choice=='Y');
        System.out.println("Maximum number is :"+max);
        System.out.println("Minimum number is :"+min);



    }


}
