package com.udemy;

interface Profitable {
    double profitPercentage = 42.0;
    public static void print(String str) {
        System.out.println("I1:" + str.toUpperCase());
    }
}

class Business implements Profitable {
    double profitPercentage = 50.0; //Line n1

    void print(String str) {
        System.out.println("C1:" + str.toLowerCase());
    }
}

interface Perishable1 {
    default int maxDays() {
        return 1;
    }
}

interface Perishable2 extends Perishable1 {
    default int maxDays() {
        return 2;
    }
}
class Milk implements Perishable2, Perishable1 {}

sealed abstract class Aa { } //Line n1

final class Bb extends Aa { } //Line n2

non-sealed class Cc extends Aa { } //Line n3

sealed abstract class Animalq permits Cat, Dogg { } //Line n1

non-sealed class Cat extends Animalq { } //Line n2

final class Dogg extends Animalq { } //Line n3



sealed interface Flyable permits Kite { //Line n1
    void fly();
}

record Kite() implements Flyable { //Line n2
    public void fly() {
        System.out.println("Kite is flying");
    }
}

interface Moveable {
    void move();

    default void log() {
        System.out.println("ILog");
    }
    void ride(String name);
}
abstract class Animal {
    void move() {
        System.out.println("ANIMAL MOVING");
    }

}
 class Dog extends Animal implements Moveable {

     public void ride(String name) {
         System.out.println(name.toUpperCase() + " IS RIDING THE HORSE");
     }

     @Override
     public void move() {

     }

 }
class Parent1 {
    String quote = "MONEY DOESN'T GROW ON TREES";
    void greet() {
        System.out.println("Good Afternoon!");
    }
}

class Child extends Parent1 {
    String quote = "LIVE LIFE KING SIZE";
    void greet() {
//        super.greet();
        System.out.println("Good Night!");
    }
}

class GrandChild extends Child {
    String quote = "PLAY PLAY PLAY";
    int a=90;
    void greet() {
        System.out.println("Good Morning!");
    }
}

interface Payment { }

class OnlinePayment { }
final class CardPayment extends OnlinePayment { }

enum Flags {
    TRUE;
}
public class Test2 {

    enum TrafficLight implements Payment {
        RED, YELLOW, GREEN;
    }

    private static void extractInt(Object obj) {
        if(obj instanceof Double d)
            System.out.println(d.intValue());
        if(obj instanceof Integer i)
            System.out.println(i.intValue());
    }
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        System.out.println("efwe"+-gc.a);
        System.out.println(((Parent1)gc).quote);
        gc.greet();
        ((Child)gc).greet();
        ((Parent1)gc).greet();
        System.out.println("---------");
        Parent1 g = new GrandChild();
        ((Parent1)(Child)g).greet();

        Business obj = new Business(); //Line n2
        System.out.println(obj.profitPercentage); //Line n3
        obj.print("Java");

        System.out.println("Calling interface--");
//        Sub sub = null;
//        System.out.println(sub.name); //Line n3
        System.out.println(Super.name);
        System.out.println(Add.name);
//        System.out.println(Sub.name);
        Perishable1 obj1 = new Milk();
        System.out.println(obj1.maxDays());

        System.out.println("----Dog-----");
        Animal animal = new Dog();
        animal.move();

        Moveable m = new Dog();
        m.move();

        Kite k = new Kite();
        k.fly();

        System.out.println("----Extract-----");

        extractInt(10.99);
        extractInt(23);
        extractInt(null);

        Flags flags = Flags.TRUE;



        TrafficLight tl = TrafficLight.valueOf(args[0]);
        switch(tl) {
            case RED -> System.out.println("STOP");
            case YELLOW -> System.out.println("SLOW");
            case GREEN -> System.out.println("GO");
        }
        }
    }

