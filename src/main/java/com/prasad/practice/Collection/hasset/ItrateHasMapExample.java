package com.prasad.practice.Collection.hasset;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ItrateHasMapExample {
    public static void main(String[] args) {
//        1.iterate through HashMap EntrySet using iterator
        System.out.println("iterate through HashMap EntrySet using iterator");
        Map<Integer,String> courseMap=new HashMap<Integer,String>();
        courseMap.put(1,"C");
        courseMap.put(2,"C++");
        courseMap.put(3,"Java");
        courseMap.put(4,"Spring Boot");
        courseMap.put(5,"Python");
        Iterator<Map.Entry<Integer,String>> iterator=courseMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String>entry=iterator.next();
            System.out.println(entry.getKey()+" " + entry.getValue());
        }
//      2.iterate through HashMap Key set using iterator
        System.out.println("iterate through HashMap Key set using iterator");
        Iterator<Integer> iterator1=courseMap.keySet().iterator();
        while (iterator1.hasNext()){
            Integer key= iterator1.next();
            System.out.println(key+" "+courseMap.get(key));
        }
//      3.iterate  HashMap using for each loop
        System.out.println("iterate  HashMap using for each loop");
        for (Map.Entry<Integer,String>entry1: courseMap.entrySet()
             ) {
            System.out.println(entry1.getKey()+" " + entry1.getValue());
        }
//      4.iterating  through a HashMap using lambada Expressions
        System.out.println("iterating  through a HashMap using lambada Expressions");
        courseMap.forEach((key,value)->{
            System.out.println(key+" " + value);
        });
//      5.loop through a HashMap using stream API
        System.out.println("loop through a HashMap using stream API");
        courseMap.entrySet().stream().forEach((entry)->{
            System.out.println(entry.getKey()+" "+entry.getValue());
        });

    }
}
