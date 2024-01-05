package com.prasad.practice.exception;

public class exception5 {
    public static void main(String[] args) {
        System.out.println("s1");
        System.out.println("s2");
        System.out.println("s3");
        System.out.println("s4");
        try{
            int i=10/2;
            System.out.println("10/2 :"+i);

            String s="stepup";
            System.out.println("length of string is :"+s.length());

            String s1="10";
            int no=Integer.parseInt(s1);
            System.out.println("Number is :"+no);

            int arr[]=new int[5];
            arr[5]=10;
            System.out.println(arr[5]);

        }catch (ArithmeticException ex){
            System.err.println("error1 handle "+ex);
        }
        catch (NullPointerException e){
            System.err.println("error2 handle "+e);
        }
        catch (NumberFormatException ex ){
            System.err.println("error3 handle "+ex);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("error4 handle "+e);
        }

        System.out.println("s5");
        System.out.println("s6");
        System.out.println("s7");
        System.out.println("s8");
    }
}
