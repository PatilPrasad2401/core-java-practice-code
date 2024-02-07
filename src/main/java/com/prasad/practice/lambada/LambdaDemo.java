package com.prasad.practice.lambada;

public class LambdaDemo {
//    global variable
    private final int no =10;
    public static void main(String[] args) {
       LambdaDemo lambdaDemo=new LambdaDemo();
        lambdaDemo.lambadaExpression();
    }
    private void lambadaExpression(){
        int a=20;
//        we can access global variable directly use in lambada Expression
        Square square=(no)->{
            System.out.println("Square of number is :"+no * no);
//        we can access local variable directly use in lambada Expression
            System.out.println("Square of Another Number is :"+a * a);
        };
//        Actual lambada expression
        square.printSquare(no);
    }
}
