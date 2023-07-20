package com.practice;

public interface a {
    void m1();

    static int m3() {
        return 0;
    }



    default void m2() {
        System.out.println("HI m2");
        final double song = 4;
        System.out.println(song);
    }
}
