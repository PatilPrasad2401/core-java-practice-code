package com.prasad.practice.homework;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String args[]){

        System.out.println("Enter the element you want to store :");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int a[]=new int[10];
        System.out.println("Enter the element you want to store :");
        for (int i=0;i<=n;i++)
        {
            a[i]= scanner.nextInt();
        }
        for (int i=n;i>=0;i--) {
            System.out.print(a[i] + "\t");
        }
    }
}
