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
class C {}
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

        int  var = 0; //Line n1
        var: for (; var < 3; var++) {  //Line n2
//            System.out.println(var%2);
            if (var % 2 == 0) {
                continue ; //Line n3
            }
            var++; //Line n4
        }
        System.out.println(var);

        System.out.println(a);


        int bb = 0;
        int t = 0;
        t :for(int i=0;i<3;i++){
            if(i ==2){
                break t;
            }
            t++;
        }
        System.out.println(t);



        int ctr = 100;
        one: for (var i = 0; i < 10; i++) {
            two: for (var j = 0; j < 7; j++) {
                three: while (true) {
                    ctr++;
                    if (i > j) {
                        break one;
                    } else if (i == j) {
                        break two;
                    } else {
                        break three;
                    }
                }
            }
        }
        System.out.println(ctr);


        String s = " abc\t ";

        System.out.println(s.trim().length());
        System.out.println(s.stripLeading().length());
        System.out.println(s.stripTrailing().length());


        String str = """
                
                a
                b
                c""";
        System.out.println(str.length());
        System.out.println();
        System.out.println();

        int d = 'a';
        System.out.println(d);
    }
}
