package com.prasad.practice;

import javax.swing.*;

public class SumOfIntDivByNine {
    public static void main(String []args){
        int sum=0,i;
        for(i=101;i<=200;i++)
        {
            if(i%9==0)
            {
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("sum of given number"+sum);
    }
}
