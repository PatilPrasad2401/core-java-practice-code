package com.prasad.practice.Collection.linkList;

import java.util.LinkedList;

public class GetLinkList {
    public static void main(String[] args) {
        LinkedList<String> cities=new LinkedList<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nashik");
        cities.add("Buldhana");
        System.out.println("Cities are -> "+cities+"\n");

//       add cities at mid any position
        cities.add(2,"Nagpur");
        System.out.println("After adding  nagpur city at any middle position:"+cities+"\n");

//        Add city at first Position
        cities.addFirst("Lonavala");
        System.out.println("After adding Lonavala  city at first position :"+cities+"\n");

//        add city at last position
        cities.addLast("Malkapur");
        System.out.println("After adding Malkapur city at last position:"+cities+"\n");

//        getting element at first position using getFirst()method in linkList
        String firstElement=cities.getFirst();
        System.out.println("get first element in to the linkList::"+ firstElement+"\n");

//        getting element at last position using getLast()method in linkList
        String lastElement=cities.getLast();
        String element=cities.get(4);
        System.out.println("get last element in to the linkList::"+ element+"\n");
//        getting element at any  position using foreach loops in linkList
        for (String str:cities) {
            System.out.println(str);
        }
    }
}
