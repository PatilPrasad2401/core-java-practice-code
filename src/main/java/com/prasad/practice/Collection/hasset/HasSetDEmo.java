package com.prasad.practice.Collection.hasset;

import java.util.HashSet;
import java.util.Set;

public class HasSetDEmo {
    public static void main(String[] args) {
        nullValue();
        duplicateValue();
        unorderdemo();
    }

    //    has set cannot allow duplicate  value
    public static void duplicateValue() {
        Set<String> set=new HashSet<>();
        set.add("element1");
        set.add("element1");
        System.out.println(set.toString());
    }


    //    has set allows null value but only one null value is allows
    public static void nullValue() {
        Set<String> set=new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set.toString());
    }
//    hasSet is an unordered collection .it does not maintain order in which the element are entered
    public static void unorderdemo() {
        Set<String> set=new HashSet<>();
        set.add("element1");
        set.add("element3");
        set.add("element2");
        set.add("element10");
        set.add("element14");
        set.add("element6");
        set.add("element5");

        System.out.println(set.toString());
    }
}
// hasSet internally use hasMap to store its element
//hasSet is not thread-safe if multiple thread try to modify a hasSet at the same time.
//then the final output is not deterministic.you must explicitly synchronize concurrent access to a hsaSet in multi-threads environment