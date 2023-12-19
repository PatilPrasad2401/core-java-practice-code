package com.prasad.practice;

import java.util.Scanner;

public class Perfect_number {
    static boolean checkPerfect(int num){
        if(num==1)
            return false;
        int sum=1;
        for (int i=2;i<num;i++)
            if (num % i == 0)
                sum += i;

        if (sum==num)
            return true;
        return false;
    }
    public static void main(String []args){
        System.out.println("Enter number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (checkPerfect(num)){
            System.out.println(num +"\tNumber is perfect number !!!");
        }
        else
            System.out.println(num +"\tNumber is not perfect number !!!");
    }
}
