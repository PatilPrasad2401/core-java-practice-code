package com.prasad.practice.exception;

class Exception22
{
    void m()
    {
        try
        {
            int data = 50 / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error 1 Handle : "+e);
        }
        System.out.println("NF1");
    }

    void n()
    {
        m();
        System.out.println("NF2");
    }

    void p()
    {
        try
        {
            n();
        }
        catch (Exception e)
        {
            System.out.println("exception handled");
        }
        System.out.println("NF3");
    }

    public static void main(String args[])
    {
        Exception22 obj = new Exception22();
        obj.p();
        System.out.println("NF4");
    }
}
