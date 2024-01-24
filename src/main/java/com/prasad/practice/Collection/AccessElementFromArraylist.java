package com.prasad.practice.Collection;

import java.util.ArrayList;
import java.util.List;

public class AccessElementFromArraylist {
    public static void main(String[] args) {
        List<String> topProgammingLang=new ArrayList<>();
        System.out.println("is the list is empty : ?"+ topProgammingLang.isEmpty());
        topProgammingLang.add("C");
        topProgammingLang.add("Java");
        topProgammingLang.add("C++");
        topProgammingLang.add("Python");
        topProgammingLang.add(".net");
        System.out.println("Here are the top programming language : "+ topProgammingLang);
        System.out.println("Here are the top programming language : "+ topProgammingLang.size() +" in the world");
        System.out.println("Best programming language is :"+topProgammingLang.get(2));
        System.out.println("Best programming language is :"+topProgammingLang.get(4));
        topProgammingLang.set(4,"JavaScript");
        System.out.println("Best programming language is :"+topProgammingLang);


    }
}
