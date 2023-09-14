package com.practice.udemy.course;

public class Outer {


    int a ;
    public Outer() {
        System.out.print(2);
    }
    /*INSERT 1*/
    {
        System.out.println(1);
    }


    public void print(String str){
        class C{
            C(){
                System.out.println(str);
            }
        }
        C c = new C();
    }

    public class Inner {
        int v;
        public Inner() {
            System.out.print(4);
        }
        /*INSERT 2*/
        {
            System.out.println(3);
        }
    }




}

