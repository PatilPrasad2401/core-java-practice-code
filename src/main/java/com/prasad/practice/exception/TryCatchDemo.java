package com.prasad.practice.exception;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("Enter 2 number");
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        String input2=sc.nextLine();
        try {
            int no1=Integer.valueOf(input1);
            int no2=Integer.valueOf(input2);
            System.out.println(no1/no2);
        }
        catch (NumberFormatException ex){
            System.err.println("Entered values are not number!!!");;
        }
    }
}
