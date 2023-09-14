package com.practice.udemy.course;

abstract class Greeting{
    public abstract void greet();
}
public class Logger  {
    static Double d1;
    static int x = d1.intValue();
    static Character obj;
    char c = obj.charValue();
    double area = 5.7;

    public static void evaluate(Threat t) { //Line n5
        t = new Threat(); //Line n6
        t.name = "PHISHING"; //Line n7
        
    }
    public static void main(String[] args) {

        Threat obj = new Threat(); //Line n1
        obj.print(); //Line n2
        evaluate(obj); //Line n3
        obj.print(); //Line n4


//        Test obj = new Test() {
//            public void Log() {
//                System.out.println("LET IT BE");
//            }
//        };
//        obj.log();

        var g = new Greeting(){
            @Override
            public void greet() {
                System.out.println("BELIEVE IN YOURSELF");
            }
        };
        g.greet();

        A a = new A() {
            @Override
            public void print() {
                System.out.println("Interface");
            }

            @Override
            public boolean check() {
                return false;
            }
        };
a.print();


        System.out.println(new Object() {
            public String toString() {
                return "ANONYMOUS";
            }
        });

        Logger lo = new Logger();

    }
    void m1(int a,byte b){
        return ;
    }
}

class Threat {
    String name = "VIRUS";

    public void print() {
        System.out.println(name);
    }
}

