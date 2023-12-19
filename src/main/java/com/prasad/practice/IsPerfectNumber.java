package com.prasad.practice;

public class IsPerfectNumber {
    static boolean isPerfect(int num){
        int sum=0;
        for (int i=1;i<num;i++){
            if (num %i==0)
            {
                sum+=i;
            }
        }
        return sum == num;
    }
    public static void main(String []args)
    {
        for (int i=1;i<=100000;i++){
            if (isPerfect(i))
            {
                System.out.println(i);
            }
        }
    }
}
