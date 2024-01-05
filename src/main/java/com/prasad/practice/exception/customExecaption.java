package com.prasad.practice.exception;

import java.util.Scanner;

public class customExecaption {
    public static void AcceptPersonalDetsils() throws NameNotProvidedExeception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name for person :");
        String name = sc.nextLine();
        System.out.println("Enter City for person:");
        String city = sc.nextLine();
        if (name.isEmpty()) {
            throw new NameNotProvidedExeception("provided name is null or invalid");
        }
        System.out.println("Personal details are :" + name + "," + city);
    }

    public static void main(String[] args) {
        while (true) {
            try {
                AcceptPersonalDetsils();
            } catch (NameNotProvidedExeception ex) {
                System.err.println(ex.getMessage());
            }
        }
    }

}
