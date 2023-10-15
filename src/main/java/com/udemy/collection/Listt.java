package com.udemy.collection;

import java.util.*;
import java.util.stream.Stream;

class Employee {
    double salary;
    String name;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }
}

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

        List<String> list = Arrays.asList("#####", "#", "##", "####", "###");
        Comparator<String> comp = Comparator.comparing(s -> s);
        Collections.sort(list, comp);
        printCodes(list);


        List<String> emails = Arrays.asList("udayan@outlook.com", "sachin@outlook.com", "sachin@gmail.com",
                "udayan@gmail.com");
        Collections.sort(emails, Comparator.comparing(str -> str.substring(str.indexOf("@") + 1)));
        for(String email : emails) {
            System.out.println(email);
        }

        List<Employee> employees = Arrays.asList(new Employee("Sameer", 10_000),
                new Employee("Sonia", 12_000),new Employee("Chaitanya", 60_000));
        employees.stream()
                .filter(x -> x.getSalary() > 10000)
                .map(e -> e.getName())
                .sorted()
                .forEach(System.out::println);

        
    }
    private static void printCodes(List<String> list) {
        for (String str : list) {
            System.out.println(str);
        }
    }
}
