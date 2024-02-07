package com.prasad.practice.model;

public interface Shape {
    void draw();

    default void paint(){
        System.out.println("Base painting done...");
    }

    static void erase(){
        System.out.println("base shape has been erase");
    }


}
