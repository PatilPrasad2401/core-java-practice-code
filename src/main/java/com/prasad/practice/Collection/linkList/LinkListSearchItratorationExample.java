package com.prasad.practice.Collection.linkList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class LinkListSearchItratorationExample {
    public static void main(String[] args) {
        List<String>progLang=new ArrayList<>();
        progLang.add("C");
        progLang.add("C++");
        progLang.add("Java");
        progLang.add("Python");
        progLang.add("JavaScript");
        System.out.println(progLang);

        Boolean result=progLang.contains("C++");
        System.out.println("Result: "+result);
        List<String> copy=new ArrayList<>(progLang);
        System.out.println("Copy array list using constructor"+copy);
        System.out.println("using java 8 feature");
        List<String>copy1=progLang.stream().collect(Collectors.toList());
        System.out.println(copy1);
        List<String>copy2=List.copyOf(progLang);
        System.out.println("using java 10 feature : "+copy2);

//        find the index of first occurrence of the element of the linkList
        int index=progLang.indexOf("Java");
        System.out.println("Index :"+index);

//        find the index of first occurrence of the element of the linkList
        int lastIndex=progLang.indexOf("JavaScript");
        System.out.println("LastIndex :"+lastIndex);

        System.out.println("using normal foreach !!");
        progLang.forEach((element)->{
            System.out.println(element);
        });
        System.out.println("using Iterator !!");
        Iterator<String> iterator=progLang.iterator();
        while (iterator.hasNext()){
            String prog=iterator.next();
            System.out.println(prog);
        }
        System.out.println("using advance foreach loop !!");
        for (String e:progLang
             ) {
            System.out.println(e);
        }
    }
}
