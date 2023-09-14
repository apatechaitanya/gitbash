package com.practice;

import java.time.*;

public class D extends C implements a {
    public static final int LENGTH ;
    String patter = "*";
    final static int a =2;
    static int ss = 2;
    static {
        LENGTH=10;
    }
    D(){
        super();
    }

    public D(int x){
        super(x);
    }
    public void print(int a){
        System.out.println("b");
    }
    public void print(float a){
        System.out.println("c");
    }
    public void print(Object a){
        System.out.println("a");
    }
    public static void main(String[] args) {
        short s = 10;
        D d = new D();
        d.print(10);
        int a = 10;
        short sss = 10;
        d.print(true);
        d.print(3.789);
        System.out.println("1"+"2"+"3"=="1"+"2"+3);
        boolean flag = false;
        System.out.println((flag = true) | (flag = false) || (flag = true));
        LocalDate date = LocalDate.of(2025, 9, 30);

        /**
         * Static method from interface
         */
        d.m3();

        /**
         * default method from a interface
         */

        D ddd = new D();
        ddd.m2();



        System.out.println("-------------------------------");

        LocalDate newYear = LocalDate.of(2028, 1, 1);
        LocalDate christmas = LocalDate.of(2028, 12, 25);
        boolean flag1 = newYear.isAfter(christmas);
        boolean flag2 = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);

        System.out.println("-------------------------------");

        LocalDate date1 = LocalDate.parse("1980-03-16");
        LocalDate date2 = LocalDate.parse("1980-03-16");
        System.out.println(date1.equals(date2) + " : " + date1.isEqual(date2));

        System.out.println("-------------------------------");

        LocalDate date3 = LocalDate.parse("1980-03-16");
        System.out.println(date3.minusYears(-5));

        System.out.println("-------------------------------");

        LocalDate joiningDate = LocalDate.parse("2006-03-16");
        System.out.println(joiningDate.withDayOfYear(29));

        System.out.println("-------------------------------");

        LocalTime localTime = LocalTime.of(23, 50);
        System.out.println(localTime);

        System.out.println("-------------------------------");
        System.out.println("Period");
        Period period = Period.of(30, 1000, 03);
        System.out.println(period);

        Period period1 = Period.of(0, 0, 0);
        System.out.println(period1);

        Period period3 = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
        System.out.println(period3);

        //more that 6 times runs
//        LocalDate date22 = LocalDate.parse("2000-06-25");
//        while(date22.getDayOfMonth() >= 20) {
//            System.out.println(date22);
//            date22.plusDays(-1);
//        }

        System.out.println("-------------------------------");

        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj.getSecond());

        System.out.println("-------------------------------");

        LocalDate d1 = LocalDate.parse("1999-09-09");
        LocalDate d2 = LocalDate.parse("1999-09-09");
        LocalDate d3 = LocalDate.of(1999, 9, 9);
        LocalDate d4 = LocalDate.of(1999, 9, 9);
        System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4));

        System.out.println("-------------------------------");

        LocalDate date11 = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date11.atTime(time));

        System.out.println("-------------------------------");

        LocalDate date4 = LocalDate.parse("2000-01-01");
        Period period2 = Period.ofYears(-3000);
        System.out.println(date4.plus(period2));

        System.out.println("-------------------------------");

        LocalDate date5 = LocalDate.of(2000, Month.JANUARY, 1);
        Period period4 = Period.parse("p-30000y");
        System.out.println(date5.plus(period4));

        System.out.println("-------------------------------");

        LocalDate date6 = LocalDate.parse("1983-06-30");
        System.out.println(date6.plusMonths(8));

        System.out.println("-------------------------------");

        LocalDate ocpCouponPurchaseDate = LocalDate.of(2023, 3, 1);
        System.out.println("Coupon expiry date: "
                + ocpCouponPurchaseDate.plusDays(10));

        System.out.println("-------------------------------");

        LocalDate date7 = LocalDate.ofYearDay(2022, 32);
        System.out.println(date7);

        System.out.println("-------------------------------");

        LocalDate date8 = LocalDate.parse("2020-08-31");
        System.out.println(date8.plusMonths(-6));

        System.out.println("-------------------------------");

        LocalDate date9 = LocalDate.ofEpochDay(-1);
        System.out.println(date9);

        System.out.println("-------------------------------");

        LocalDateTime dt = LocalDateTime.parse("2018-03-16t10:15:30.22");
        System.out.println(dt.toLocalDate() + " " + dt.toLocalTime());

        System.out.println("-------------------------------");

        LocalDate startDate = LocalDate.of(2023, Month.MARCH, 1);
        LocalDate endDate = LocalDate.of(2023, Month.MARCH, 11);

        System.out.println(Period.between(endDate, startDate));

        System.out.println("-------------------------------");

        System.out.println("FIFA "+Period.between(LocalDate.now(),LocalDate.parse("2022-11-21")));
        System.out.println(Duration.ofDays(-2));

        System.out.println("-------------------------------");
            /**
             * Got an error
             */
//        LocalDate dd1 = LocalDate.now();
//        LocalDateTime dd2 = LocalDateTime.now();
//        System.out.println(Duration.between(dd1, dd2));

//        LocalDate dd1 = LocalDate.now();
//        LocalDateTime dd2 = LocalDateTime.now();
//        System.out.println(Duration.between(dd1, dd2));

        LocalTime t1 = LocalTime.now();
        LocalDateTime t2 = LocalDateTime.now();
        System.out.println(Duration.between(t1, t2));

        System.out.println("-------------------------------");

        Boolean b1 = Boolean.valueOf("tRue");
        System.out.println(b1);
//        System.out.println(date);
        D dd = new D(3);
//        dd.m2();

        System.out.println(s);


    }

    @Override
    public void m1() {
        System.out.println("Hi m1");
        D sd = new D(2);

        System.out.println();
    }
    public int m3(){
        return 2;
    }
    final static void run(){}
    static final void s(){}

class E{
        public void m1(){
            System.out.println("Class E m1 method");
        }
}
    public void m4() { //Line n1
        System.out.println("Foo : m1()");
        Bar bar = new Bar();
        bar.m4();
    }
    static {
        System.out.println("D static");
    }
    class Bar {
        static {
            System.out.println("Bar static");
        }
        public void m4() { //Line n2
            System.out.println("Bar : m1()");
        }
    }
}
