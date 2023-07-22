package com.udemy;

public class Udemy {

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
