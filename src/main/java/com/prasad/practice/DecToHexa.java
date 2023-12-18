package com.prasad.practice;

import java.util.Scanner;

public class DecToHexa {
    void DecimalToHexa(int num){
        int[] hexa=new int[100];
        int i=0;
        while(num!=0){
            hexa[i]=num%16;
            num=num/16;
            i++;
        }
        for (int j=i-1;j>=0;j--){
            if (hexa[j]>9)
                System.out.print((char) (55 + hexa[j]));
            else
                System.out.print(hexa[j]);
        }
    }
    public static void main(String args[]){
        System.out.println("Enter Decimal Value :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        DecToHexa dec=new DecToHexa();


        dec.DecimalToHexa(num);

    }

}
