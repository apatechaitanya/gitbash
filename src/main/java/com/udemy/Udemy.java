package com.udemy;

public class Udemy {

    enum Month {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }

    public static void main(String[] args) {
        String fName = "   Joshua  ";
        String lName = "Bloch";
        System.out.println(fName);
        System.out.println(fName.strip());

        String a = " ";
        System.out.println(a+" : "+a.isEmpty());
        System.out.println(a.isBlank());

        a.strip();

        System.out.println(a+" : "+a.isEmpty());
        System.out.println(a.isBlank());

        System.out.println("--------------");

        final int i1 = 1;
        final Integer i2 = 1;
        final String s1 = ":ONE";

        String str1 = i1 + s1;
        String str2 = i2 + s1;

        System.out.println(str1 == "1:ONE");
        System.out.println(str2.equals("1:ONE"));
        System.out.println(s1.repeat(5));

        System.out.println("--------------");
        var str = "MISSS";
        var sb = new StringBuilder("THET");
        System.out.println(str.replace("SS", "t")); //Line n1
        System.out.println("--------------");
        System.out.println();
        System.out.println(str.replace("MI",""));
        m1(null);
        System.out.println("--------------");
        String [] arr1 = {null, null};
        System.out.println("1. " + String.join("-", arr1));

        String [] arr2 = {};
        System.out.println("2. " + String.join("-", arr2));

        var str11 = "USER GENERATED";
        str11 = String.join("-", str11.split(" "));
        System.out.println(str11);
        System.out.println("--------------");
        var str22 = "BEVERAGE";
        var arr = str22.split("E", 3);
        System.out.println(String.join(".", arr));
        System.out.println("--------------");
        String txt = "an";
        System.out.println(txt.split("an").length);
        System.out.println("--------------");
        String t = new String("Chaitanya");
        String tt = "Chaitanya";
        String ttt = t.toString();
        System.out.println(tt.toString()==tt.toString());


        var empty = """
                """;
        System.out.println(empty.length());


        var s111 = """
            1Z0-829""";
        var s2 = """
            1Z0-829
            """;
        var s3 = """
            1Z0-829\
            """;
        System.out.println((s111 == s2) + ":" + (s2 == s3) + ":" + (s111 == s3));


        var multiline = """
            SUN \s
            MON \s
            TUE \s
            """;

        multiline.indent(2)
                .lines()
                .map(s -> ">" + s + "<")
                .forEach(System.out::println);

        var sbb = new StringBuilder("Hakuna"); //Line n3
        change(sbb); //Line n4
        System.out.println(sbb); //Line n5

        var sb1 = new StringBuilder("HavePatience");
        sb1.delete(4, 5).insert(4, " P").toString().toUpperCase();
        System.out.println(sb1);


        var sb5 = new StringBuilder(100);
        System.out.println(sb5.length() + ":" + sb5.toString().length());

        var sb6 = new StringBuilder("Friends are treasures");
        sb6.delete(0, 100);
        System.out.println(sb6.length());

        var sb7 = new StringBuilder(20); //Line n1
        sb7.append("A".repeat(25)); //Line n2
        System.out.println(sb7.toString().length()); //Line n3

        sb7.setLength(10); //Line n4
        System.out.println(sb7.toString().length());


        var sb8 = new StringBuilder("B"); //Line n1
        sb8.append(sb8.append("A")); //Line n2
        System.out.println(sb8);



        //switch
        String sport = "swimming";
        switch (sport) {
            default:
                System.out.println("RUNNING");
                break;
            case "Tennis":
                System.out.println("TENNIS");break;
            case "Swimming":
                System.out.println("SWIMMING");break;
            case "Football":
                System.out.println("FOOTBALL");
                break;
        }

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



        var day = 3;
        switch(day) {
            case '3':
                System.out.println("BUY 2 GET 1 FREE");
                break;
            default:
                System.out.println("SORRY!!! NO SALE");
        }

        int x = 5;
        String msg = switch(x) {
            case 1,3,5,7,9 -> "Odd Number";
            case 0,2,4,6,8 -> "Even Number";
            default -> "Not in range";
        };
        System.out.println(msg);



        // switch yield

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



        int xx = 100;

        String txtx = switch(xx) { //Line n1
            case 10 -> "TEN"; //Line n2
            case 100 -> switch(10) { //Line n3
                default -> "HUNDRED"; //Line n4
            }; //Line n5
            default -> "NA"; //Line n6
        }; //Line n7

        System.out.println(txtx);



        int dayy = 5;
        String dayName = switch(dayy) {
            case 1 -> "SUNDAY";
            case 2 -> "MONDAY";
            case 3 -> "TUESDAY";
            case 4 -> "WEDNESDAY";
            case 5 -> "THURSDAY";
            case 6 -> "FRIDAY";
            case 7 -> "SATURDAY";
            default -> "NA";
        };
        System.out.println(dayName);


        var month = Month.SEP;
        switch (month) {
            case JAN, FEB, MAR -> System.out.print("SPRING");
            case APR, MAY, JUN -> System.out.print("SUMMER");
            case JUL, AUG, SEP -> System.out.print("MONSOON");
            case OCT, NOV, DEC -> System.out.println("WINTER");
        }


        int xc = 4;
        switch (xc) {
            default -> System.out.println("Unknown");
            case 1 -> System.out.println("x is equal to 1");
            case 2 -> System.out.println("x is equal to 2");
            case 3 -> System.out.println("x is equal to 3");
        }
    }
    private static void change(StringBuilder s) {
        s.append("_Matata"); //Line n9
    }
    static void m1(CharSequence s) {
        System.out.println("CharSequence");
    }

    static void m1(String s) {
        System.out.println("String");
    }

    static void m1(Object s) {
        System.out.println("Object");
    }
}
