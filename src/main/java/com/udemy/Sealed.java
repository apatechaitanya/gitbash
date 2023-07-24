package com.udemy;

sealed class A permits B{

}
non-sealed class B extends A{
    int per(int a,int b){
        var tb1 = """
            Let the\
            race begin.\
        """;
        var tb2 = """
            Let the race begin.""";
        var tb3 = "Let the race begin.";

        System.out.print(tb1 == tb2);
        System.out.print(tb2 == tb3);
        System.out.print(tb1 == tb3);


        var sb = new StringBuilder("HavePatience");
       sb.delete(4, 5).insert(4, " P").toString().toUpperCase();
        System.out.println(sb);

        int day = '3';
        switch(day) {
            case '3':
                System.out.println("BUY 2 GET 1 FREE");
                break;
            default:
                System.out.println("SORRY!!! NO SALE");
        }

        System.out.println("*".repeat(7));
      return a%b;
    }
}
class C {



}
public class Sealed {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.per(1,2));

        int x = 4;
        String a = switch (x){
            case 1,2: yield "2";
            case 3: yield "3";
            default: yield "default";
        };

        System.out.println(a);
    }
}
