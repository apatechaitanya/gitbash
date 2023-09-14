package com.practice;


import com.practice.udemy.course.A;
import com.practice.udemy.course.Outer;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class C extends abs implements a{
    public static int LENGTH ;

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

        List list = null;
        list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1,100);
        list.set(0, "");
        int l = 1;
        list.replaceAll(x->l*2);
        System.out.println(list);

        System.out.println("Remove if "+list.removeIf(s->s.equals(20)));


        list = new ArrayList<String>();
        list.add("dvdf");
        System.out.println(list);



        var tb1 = """
            Let the \
            race begin.\
        """;
        var tb2 = """
            Let the race begin.""";
        var tb3 = "Let the race begin.";

        System.out.print(tb1 == tb2);
        System.out.print(tb2 == tb3);
        System.out.print(tb1 == tb3);
        var multiline = """
            SUN \s
            MON \s
            TUE \s
            """;

        multiline.indent(2)
                .lines()
                .map(s -> ">" + s + "<")
                .forEach(System.out::println);



        var json = """
            {
                "fName":\"%s\",
                "lName":"%s"
            }
            """.formatted("Udayan", "Khattry");
        System.out.println(json);

        var text = """
            *
            *
            *
            *
            *
        """;
        System.out.println(text.indent(-100));



        var sb = new StringBuilder("Breathe Deeply");
        var str1 = sb.toString();
        var str2 = "Breathe Deeply";

        System.out.println(str1 == str2);


        System.out.println(String.join(",", "\"A\"", "\"B\"", "\"C\"") + ".");



        var _sb = new StringBuilder("B"); //Line n1
        _sb.append(_sb.append("A"));
        System.out.println(_sb); //Line n1


        String furniture = new String(new char[] {'S', 'o', 'f', 'a'});
        switch (furniture) {
            default:
                System.out.println("CHAIR");
            case "Recliner":
                System.out.println("RECLINER");
            case "Sofa":
                System.out.println("SOFA");
            case "Bed":
                System.out.println("BED");
                break;
        }

        int var = 7;
        switch('7') {
            case '7':
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }

        var month = Month.APRIL;
        var quarter = switch(month) {
            case JANUARY, FEBRUARY, MARCH -> "1";
            case APRIL, MAY, JUNE -> "2";
            case JULY, AUGUST, SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER -> "3";
        };
        System.out.println(quarter);


        var dayofWeek = DayOfWeek.TUESDAY;
        var textt = switch(dayofWeek) {
            case SATURDAY -> "REST";
            case SUNDAY -> throw new IllegalArgumentException("NOT AVAILABLE");
            default  -> "WORK";
        };
        System.out.println(textt);



        int jobCode = 0;
        String status = switch(jobCode) {
            case -1 -> {
                String temp = "FAILED";
                yield temp;
            }
            case 0 -> "RUNNING";
            case 1 -> {
                yield "SUCCESS";
            }
            default -> "NA";
        };
        System.out.println(status);

        enum Month {
            JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
        }

        var monthh = Month.JUN;
        switch (monthh) {
            case JAN, FEB, MAR -> System.out.print("1st quarter");
            case APR, MAY, JUN -> System.out.print("2nd quarter");
            case JUL, AUG, SEP -> System.out.print("3rd quarter");
            case OCT, NOV, DEC -> System.out.println("4th quarter");
        }
        var a = 5;
        var x = 20;
        switch(x) {
            case 10 ->
                    a *= 2;
            case 20 ->
                    a *= 3;
            case 30 ->
                    a *= 4;
        }
        System.out.println(a);



        final boolean flag ;
        flag= false; //Line n1
        while(flag) {
            System.out.println("Good Morning!"); //Line n2
        }

        int start = 1;
        int sum = 0;
        do {
            if(start % 2 == 0) {
                continue;
            }
            sum += start; //Line n1
        } while(++start <= 10);
        System.out.println(sum);


        int i;
        outer:
        do {
            i = 5;
            inner:
            while (true) {
                System.out.println(i--);
                if (i == 4) {
                    break outer;
                }
            }
        } while (true);



        String elements = "C";
        System.out.println(elements.length()); //Line n4



        var varr = 0; //Line n1
        var: for (; varr < 3; varr++) {  //Line n2
            if (varr % 2 == 0) {
                continue var; //Line n3
            }
            varr++; //Line n4
        }
        System.out.println(varr);



        int ctr = 100;
        one: for (var ii = 0; ii < 10; ii++) {
            two: for (var j = 0; j < 7; j++) {
                three: while (true) {
                    ctr++;
                    if (ii > j) {
                        break one;
                    } else if (ii == j) {
                        break two;
                    } else {
                        break three;
                    }
                }
            }
        }
        System.out.println(ctr);




        var res = ""; //Line n1
        String [] arr = {"Dog", null, "Friendly"};
        for(String s : arr) { //Line n2
            res += String.join("-", s); //Line n3
        }
        System.out.println(res); //Line n4


        loop: for(var ii = 1; ii <= 5; ii++) { //Line n1
            switch(ii) {
                case 1:
                    res += "UP ";
                    break;
                case 2:
                    res += "TO ";
                    break;
                case 3:
                    break;
                case 4:
                    res += "DATE";
                    break loop;
            }
        }

        System.out.println(String.join("-", res.split(" "))); //Line n2


        System.out.println(new D().patter.repeat(5).length());
        var aaa = new D().new E();
        aaa.m1();


        var D = new D();
        var E = D.new Bar();

        new D().new Bar();
        E.m4();







        Outer aa = new Outer();
        aa.new Inner();

        aa.print("CJo");


//        String[] are = new String[]{"aa", "bb", "cc"};
//        var lst = List.of(are);
//        lst.add("dd");
//        lst.remove(0);
//        lst.remove("cc");
//        System.out.println(lst);


        Stream<String> t = Stream.of("car", "boat", "truck", "plane");
        t.filter(y -> y.startsWith("t")).forEach(System.out::print);

        String str3 = "";
       


    }

    @Override
    String absm() {
        return "null";
    }




}
