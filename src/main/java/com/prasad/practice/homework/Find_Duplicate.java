package com.prasad.practice.homework;
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
    static public void main(String[] args)
    {
        int[] arr
                = new int[] { 10, 2, 6, 3, 8, 10, 3, 4, 9 };
        Find_Duplicate fd=new Find_Duplicate();
        fd.findRepeating(arr);
    }
}


