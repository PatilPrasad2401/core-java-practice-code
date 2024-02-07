package com.prasad.practice.defaultStaticMethod;

import com.prasad.practice.model.Circle;
import com.prasad.practice.model.Shape;
import com.prasad.practice.model.Square;

public class DefaultStaticMethodDemo {
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.draw();
        shape.paint();
        Shape.erase();
        System.out.println("=======================");
        shape=new Square();
        shape.draw();
        shape.paint();
        Shape.erase();

        }

    }
