package com.prasad.practice.exception;

public class exception6 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[5] = 30 / 0;
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("error4 handle " + e);
        } catch (ArithmeticException ex) {
            System.err.println("error1 handle " + ex);
        }

    }
}
