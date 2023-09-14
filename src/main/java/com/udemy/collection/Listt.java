package com.udemy.collection;

import java.util.*;
import java.util.stream.Stream;


class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Listt {

    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.age>o2.getAge()){
                    return 1;
                }else {
                    return -1;
                }
            }

        };

        List l = null;
        l = new ArrayList<Integer>();
        l.add(10);
        l.add(10);
        l.add(10);
        System.out.println(l);
        l = new LinkedList<Integer>();
        l.add(1109202300);
        l.add(1109202304);
        l.add(1109202229);
        l.add(1109202301);
//        Collections.sort(l,com);
        System.out.println(l);
        System.out.println("Sort by Object");

        l = new LinkedList<Student>();
        l.add(new Student(100,"X"));
        l.add(new Student(67,"Y"));
        l.add(new Student(89,"Z"));
        l.add(new Student(1,"A"));
        l.add(new Student(10,"B"));
        Collections.sort(l,com);
        l.stream().forEach(i-> System.out.println(i.toString()));

        LinkedHashMap<Integer,Integer> hashMap = new LinkedHashMap<Integer,Integer>();
        hashMap.values();
    }
}
