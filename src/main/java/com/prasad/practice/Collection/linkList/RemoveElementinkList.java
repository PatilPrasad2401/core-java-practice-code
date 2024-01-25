package com.prasad.practice.Collection.linkList;

import java.util.LinkedList;

public class RemoveElementinkList {
    public static void main(String[] args) {
        LinkedList<String> cities=new LinkedList<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nashik");
        cities.add("Buldhana");
        System.out.println("Cities are -> "+cities+"\n");

//        getting element at first position using getFirst()method in linkList
        String firstElement=cities.getFirst();
        System.out.println("get first element in to the linkList::"+ firstElement+"\n");

//        getting element at last position using getLast()method in linkList
        String lastElement=cities.getLast();
        String element=cities.get(2);
        System.out.println("get last element in to the linkList::"+ element+"\n");
//        getting element at any  position using foreach loops in linkList
        for (String str:cities) {
            System.out.println(str);
        }

        String first=cities.removeFirst();
        System.out.println("Remove first element in to the linkList::"+ first+"\n");
        cities.removeLast();
        System.out.println("Remove last element in to the linkList::"+ cities+"\n");
        cities.remove("Nashik");
        System.out.println("Remove any  element in to the linkList::"+ cities+"\n");
        cities.clear();
        System.out.println("Remove all element in to the linkList::"+ cities+"\n");

    }
}
