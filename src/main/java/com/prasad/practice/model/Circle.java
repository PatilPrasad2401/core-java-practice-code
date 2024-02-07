package com.prasad.practice.model;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("circle Drown successfully...");
    }

    @Override
    public void paint() {
//        Shape.super.paint();
        System.out.println("Circle paint with based colour....");
    }
}
