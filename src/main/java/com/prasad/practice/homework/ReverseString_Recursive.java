package com.prasad.practice.homework;

public class ReverseString_Recursive {
    void reverse(String str){
        if ((str==null)|| (str.length()<=1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
    public static void main(String[] args) {
        String str=" Hollow World";
        ReverseString_Recursive rev=new ReverseString_Recursive();
        rev.reverse(str);
    }
}
