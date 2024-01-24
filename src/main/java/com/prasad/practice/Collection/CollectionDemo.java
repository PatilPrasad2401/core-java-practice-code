package com.prasad.practice.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("banana");
        fruitCollection.add("mango");
        fruitCollection.add("apple");
        System.out.println("=============add method output==============");
        System.out.println("Fruit name are" + fruitCollection);
        System.out.println("=============contain method output==============");
        System.out.println(fruitCollection.contains("banana"));
        System.out.println(fruitCollection.contains("kiwi"));
        System.out.println("========lambda reference=================");
        fruitCollection.forEach(System.out::println);
        System.out.println("========lambda=================");
        fruitCollection.forEach((eleent) ->
        {
            System.out.println(eleent);
        });
        System.out.println("=========remove method output==========");
        fruitCollection.remove("apple");
        System.out.println("Fruit name are" + fruitCollection);
        System.out.println("=========removeAll method output==========");
        fruitCollection.removeAll(fruitCollection);
        System.out.println("Fruit name are" + fruitCollection);
        System.out.println("=========clear method output==========");
        fruitCollection.clear();
        System.out.println( fruitCollection);

    }

}
