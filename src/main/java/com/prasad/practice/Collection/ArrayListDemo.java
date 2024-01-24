package com.prasad.practice.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
//      add data using Arraylist constructor and add() method
        list1.add("Mango");
        list1.add("Banana");
        list1.add("Apple");
        list1.add("Orange");
        System.out.println(list1);

        List<Integer> firstFivePrime =new ArrayList<>();
        firstFivePrime.add(2);
        firstFivePrime.add(3);
        firstFivePrime.add(5);
        firstFivePrime.add(7);
        firstFivePrime.add(11);

        List<Integer> firstTenPrime=new ArrayList<>(firstFivePrime);
        List<Integer> nextFivePrime=new ArrayList<>();
        nextFivePrime.add(13);
        nextFivePrime.add(17);
        nextFivePrime.add(19);
        nextFivePrime.add(23);
        nextFivePrime.add(29);
        firstTenPrime.addAll(nextFivePrime);
        System.out.println(firstTenPrime);






    }
}