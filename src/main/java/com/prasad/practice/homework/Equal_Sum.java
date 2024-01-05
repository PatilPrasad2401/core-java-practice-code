package com.prasad.practice.homework;

public class Equal_Sum {
    static int find_element(int size,int arr[]){
        int right_sum=0,left_sum=0;
        for (int i=1;i<size;i++)
            right_sum+=arr[i];
        for (int i=0,j=1;j<size;i++,j++){
            right_sum-=arr[j];
            left_sum+=arr[i];
            if (right_sum==left_sum)
                return arr[i+1];
        }

        return -1;

    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 1, 4, 5 };
        int size = arr.length;
        System.out.println(find_element(size, arr));
    }
}
