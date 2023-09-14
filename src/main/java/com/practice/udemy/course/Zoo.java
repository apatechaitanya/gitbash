package com.practice.udemy.course;

class Animal {
    public Animal() {
        System.out.print("hi-");
    }
    public Animal(String name) {
        System.out.print(name);
    }
}
class Parrot extends Animal {
    public Parrot(String name) {
        System.out.print("parrot");
    }
}
class Zoo {
    public static void main(String[] args) {
        Animal parrot = new Parrot("rio-");
    }
}