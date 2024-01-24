package com.prasad.practice.Collection;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWayIteratorIntegrateOverList {
    public static void main(String[] args) {
        List<String> courses= Arrays.asList("C,C++,Java,Python,.net,C#");
//      Basic for loop
        System.out.println("===========basic for loop============");
        for (int i=0;i<courses.size();i++) {
            System.out.println(courses.get(i));
        }
//       Enhanced foreach loop
        System.out.println("===========foreach loop============");
        for (String course:courses) {
            System.out.println(course);
        }
//        basic loop with itrator
        System.out.println("===========basic loop with iterator============");
        for(Iterator iterator=courses.iterator(); iterator.hasNext();){
            String course=(String) iterator.next();
            System.out.println(course);
        }
//        itraor with while loop
        System.out.println("===========iterator with while loop============");
        Iterator iterator=courses.iterator();
        while (iterator.hasNext()){
            String course=(String) iterator.next();
            System.out.println(course);
        }
//        using java8 + lambda example
        System.out.println("===========java8 with lambada example============");
        courses.stream().forEach(course-> System.out.println(course));
        System.out.println("=======================");
    }
}
