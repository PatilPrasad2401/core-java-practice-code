package com.prasad.practice.functioninterface;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        // local variable inference as lambda expression/function does not need
        // explicit declaration of data type; it is being identified implicitly
        Function<String, String> lowercase = String::toLowerCase;
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(lowercase.apply(str));

        Function<String[], List<String>> listcalculater = Arrays::asList;
        System.out.println(listcalculater.apply("pune,mumbai,nagpur,strata".split(",")));
//        java 8 style
        StringAppender java8Appender = (String s1, String s2) -> {
            return s1 + s2;
        };
        StringAppender java10Appender=(var s1,var s2)->s1+s2;

        StringAppender java17Appender=(s1,s2)->s1+s2;

        System.out.println("Functional Interface for appender java 8 style :"+java8Appender.append("pune ","city"));
        System.out.println("Functional Interface for appender java 10 style :"+java10Appender.append("mumbai ","city"));
        System.out.println("Functional Interface for appender java 17 style :"+java17Appender.append("nashik ","city"));
    }
    @FunctionalInterface
    public interface StringAppender {
        String append(String firststring, String secondString);
    }
}
