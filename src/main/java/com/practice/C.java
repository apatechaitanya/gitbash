package com.practice;


public class C extends abs implements a{
    public static int LENGTH ;

    static int bbb=01;

    public C(int x) {
        setLENGTH(x);
    }

    public static int getLENGTH() {
        return LENGTH;
    }

    static {
        LENGTH=10;
    }

    public static void setLENGTH(int LENGTH) {
        C.LENGTH = LENGTH;
    }

    public C(int i, int i1) {
        this(3,3,3);
        System.out.println(i+i1);
    }
   public C(){
        this(0,0);
   }


    public C(int i, int i1, int i2) {
    }

    @Override
    public void m1() {

    }
    @Override
    public void m2(){
        System.out.println("HI m2 from C class");
    }

    public static void main(String[] args) {
        C c = new C();
        c.m2();
        System.out.println(a.m3());
    }

    @Override
    String absm() {
        return "null";
    }
}
