package com.prasad.practice.inheriance;

public class Animal {
    void makeSound() {
        System.out.println("Animal make sound!!!");
    }
}
    class Cat   {
        void makeSound() {
            System.out.println("the cat quarrels !!! ");
        }


    public static void main(String[] args) {
        Animal a=new Animal();
        Cat c=new Cat();
        a.makeSound();
        c.makeSound();

}

}
