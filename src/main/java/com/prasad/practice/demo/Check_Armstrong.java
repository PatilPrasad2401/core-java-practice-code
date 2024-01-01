package com.prasad.practice.demo;

import java.util.Scanner;

public class Check_Armstrong {
        static int isArmstrong(int num) {
            int rem, result = 0;
            while (num != 0) {
                rem = num % 10;
                result += rem * rem * rem;
                num /= 10;
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println("Please enter number : ");
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            int n=num;
                int s=isArmstrong(num);

                if (num == s) {
                    System.out.println(num +" is armstrong!!");
                }
                else
                    System.out.println(num + "is not armstrong!!");
            }
        }
