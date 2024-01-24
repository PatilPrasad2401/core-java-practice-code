package com.prasad.practice.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        List<String> list=new ArrayList<>();
//      list allows you to add duplicate value
        list1.add("element1");
        list1.add("element2");
        list1.add("element3");
        list1.add("element2");
        System.out.println(list1);
//      list allows you to add null values
        list1.add(null);
        list1.add(null);
        System.out.println(list1);

//      insertion order
        System.out.println("==========New List===========");

        list.add("element1");
        list.add("element2");
        list.add("element4");
        list.add("element3");
        list.add("element5");
        System.out.println(list);
        System.out.println("==========get method===========");
        System.out.println(list.get(0));
        System.out.println(list.get(4));


    }
}
