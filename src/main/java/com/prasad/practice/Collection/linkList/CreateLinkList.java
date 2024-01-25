package com.prasad.practice.Collection.linkList;

import javax.swing.text.Position;
import java.util.LinkedList;

public class CreateLinkList {
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
    }
}
