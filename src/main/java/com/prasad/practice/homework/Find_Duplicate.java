package com.prasad.practice.homework;

import java.util.Scanner;

// Java program to find the only repeating
// element in an array where elements are
// from 1 to N-1.using System;
public class Find_Duplicate {
    void findRepeating(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[i]);
            }
        }

    }

    // Driver's code
    static public void main(String[] args)
    {

        // Code
        int[] arr
                = new int[] { 10, 2, 6, 3, 8, 10, 3, 4, 9 };
        Find_Duplicate fd=new Find_Duplicate();
        fd.findRepeating(arr);

        // Function call

    }
}

// This code is contributed by phasing17

