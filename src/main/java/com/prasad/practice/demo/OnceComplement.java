package com.prasad.practice.demo;

import java.util.Scanner;

public class OnceComplement {
    int totalbits(int num){
        return (int)(Math.log(num)/ Math.log(2)) + 1;
    }
    void complement(int num){
        if (num<0)
        {
            System.out.print("\n "+~num);
        }
        else
        {
            int ones=((1 << totalbits(num)) - 1)^num;
            System.out.print("\n "+ones);
        }
    }

    public static void main(String []args){
        System.out.println("Please enter number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        OnceComplement o=new OnceComplement();

        o.complement(num);

        
    }
}
