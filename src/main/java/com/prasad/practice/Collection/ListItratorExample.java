package com.prasad.practice.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItratorExample {
    public static void main(String[] args) {
        List<String>programmingLang=new ArrayList<>();
        programmingLang.add("C");
        programmingLang.add("C++");
        programmingLang.add("Java");
        programmingLang.add("Python");
        programmingLang.add("JavaScript");
        ListIterator<String> listIterator=programmingLang.listIterator();
        System.out.println("forward direction Iteration :");
//        using hasNext method and next method
        while (listIterator.hasNext())
        {
            String element=listIterator.next();
            System.out.println(element);
        }
        System.out.println();
        System.out.println("backward direction Iteration :");
//        using hasPrevious method and next method
        while (listIterator.hasPrevious()){
            String element=listIterator.previous();
            System.out.println(element);
        }
    }
}
