package com.prasad.practice;

import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String args[]){
       System.out.println("Please enter octal number :");
        Scanner sc=new Scanner(System.in);
        String oct,hex;
        int dec;
        oct=sc.nextLine();
        System.out.println("Octal number is :"+ oct);
        dec = Integer.parseInt(oct, 8);
        hex = Integer.toHexString(dec);

        System.out.print("Hexadecimal Number: "+ hex);
    }
}
