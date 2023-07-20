package com.practice;

import java.awt.*;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
//        int h = 0b101;
//        double c = 1_0.0;
//        String a = "10";
//        String b = "10";
//        System.out.println(h);
//        System.out.println(c);
//        System.out.println(Integer.valueOf(a));
//        System.out.println(Integer.parseInt(b));
//        //find max
//        System.out.println(Long.max(Integer.valueOf(a),Integer.parseInt(b)));


        Object obj = new String("Hello World!");
        if (obj instanceof String) {
            System.out.println(obj + " is instance of String class"); // This msg is printed
        } else {
            System.out.println(obj + " is not instance of String class");
        }

//        byte a = 9;
//        short b = 10;
//
//        double c = a +b;
//        System.out.println(c);


        long a = 10;
        int b = 1 % 2;
        System.out.println(b);

//        int Status = 1;
//        String status = switch(Status){
//            case 1 -> "Pending";
//        };
        switch ("Violin") {
            case "VIOLIN":
                String hi = "Hi";
                System.out.println(hi);
        }
//        String name = "";
//        int i = 0;
//        while(i<2){
//            name+="A";
//            i++;
//        }
//        System.out.println(name.length() +""+ name);


//        int w = 0, r = 1;
//        String name = "";
//        while (w < 2) {
//            name += "A";
//            do {
//                name += "B";
//                if (name.length() > 0) name += "C";
//                else break;
//            } while (r <= 1);
//            r++;
//            w++;
//        }
//        System.out.println(name);



        byte aa = 1;
        switch (aa){
            case 1 :
                System.out.println("red");
                break;
            default:
                System.out.println("default");
                break;
        }

        String name = "animal";
        System.out.println(name.indexOf("l"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("a",4));
        System.out.println(name.substring(1,4)); //nim

        String [] aaa = {"3","1","2"};
        Arrays.sort(aaa);
        for(int i=0;i<aaa.length;i++){
            System.out.print(aaa[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(aaa,"2"));



//        int numFish = 1;
//        String n = "tuna";
//        String anotherFish = numFish +1;   // error
//        System.out.println(anotherFish + " "+n);
//        System.out.println(numFish +" "+1);
        int[][] scores = new int[5][];
        Object[][][] cubbies = new Object[3][0][5];
//        String beans[] = new bean[6];
        java.util.Date[] dates[] = new java.util.Date[2][];
//        int[][]types = new int[];
//        int [][] java = new int[][];

        //String equals
        String s = "Hello";
        String t = new String(s);

        if(s.equals(t)){
            System.out.println("one");
        }
        if(t==s){
            System.out.println("two");
        }
        if(t.intern()==s){
            System.out.println("three");
        }
        if("Hello".equals(s)){
            System.out.println("four");
        }
        if("Hello".intern()==t){
            System.out.println("five");
        }

        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb);

        double one = Math.pow(1,2);
        /**
         * Below line contains compiler error
         */
//        int two = Math.round(1.0);
//        float three = Math.random();
//        var double = new double[]{one,two,three};
//        var builder = new StringBuilder();
//        var string = "12345";
//        System.out.println(builder.charAt(4));

//        int a1[] = {1,2,3};
//        int bb[] = {1,2,3};
//        if(a1.equals(bb)){
//            System.out.println("a");
//        }
////
////        int one1 = Math.min(5,3);
////        long two = Math.round(5.5);
////        double three = Math.floor(6.6);
////
//////        var double = new double[]{one1,two,three};
//////    var date = LocalDate.of(2022,4,3);
//////    date.plusDays(2);
//////    date.pl
        System.out.println("012345678".substring(7));
        String base = "ewe\nsheep\\t";
        int length = base.length();
        int indent = base.indent(2).length();
        int translate = base.translateEscapes().length();
//        System.out.println(base+" "+length+" "+""+translate+" "+indent);

        System.out.println("%s %s %s".formatted(length,indent,translate));

        String a1 = "aaa";
        System.out.println(a1.indent(1).length());

        final double song = 6;
        System.out.println(song);

        Boolean[] b1 = new Boolean[2];
        Boolean[] b2 = {true,false};

        System.out.println(b1.length);
        System.out.println(b2.length);


        System.out.println(jan(3,3,3));

    }
    public static int jan(int...a){
        return 9;
    }


}

