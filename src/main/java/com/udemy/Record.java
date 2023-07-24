package com.udemy;



record Alien(int id,String name){

}

public class Record {
    public static void main(String[] args) {
        Alien a1 = new Alien(1,"Chaitanya");

        System.out.println(a1);
    }
}


