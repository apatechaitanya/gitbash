package com.udemy;

import com.practice.udemy.course.A;
class Vehicle {
    public double getRegistrationNumber() {
        return 1;
    }
}

class Car extends Vehicle{
    public double getRegistrationNumber() {
        return 2.0;
    }
}
class Parent {
    public void produce() {
        record Child1(String name) {} //Line n1
        enum Child2 {ZERO, ONE} //Line n2
        interface Child3 { public void play(); } //Line n3
        class Child4 implements Child3 {public void play(){} } //Line n4
        System.out.println("DONE");
    }
}
abstract class Base {
    int a = 10;
    String str = "C";
    public void m1() {
        System.out.println("Base: m1()");
    }
    abstract long m2();
    abstract Object get();
}
class Shape {
    int side = 0; //Line n1

    int getSide() { //Line n2
        return side;
    }
    static String getType() { //Line n1
        return "GENERIC";
    }
}

class Square extends Shape {
    private int side = 4; //Line n3

    protected int getSide() { //Line n4
        return side;
    }
    static String getType() { //Line n1
        return "Hu";
    }
}
class Derived extends Base {
    private int a=9;
    protected String str = "D";
     public void m1() {
        System.out.println("Derived: m1()");
    }


    @Override
    long m2() {
        return 0;
    }

    @Override
    String get() {
        return null;
    }

}
public class Test extends Parent {

    public static void main(String[] args) {
        new Parent().produce();

        Vehicle v = new Car();

        Base b = new Derived();
        b.m1();
        A a = new A() {
            @Override
            public void print() {
                System.out.println(new Qu(10).sum());
            }
            @Override
            public boolean check() {
                return false;
            }

            record Qu(int b){
                int sum(){
                    return b*a;
                }
            }
        };
        a.print();
        Shape s = new Square();
        System.out.println(s.side + ":" + s.getSide());
        Shape.getType();

    }
}
