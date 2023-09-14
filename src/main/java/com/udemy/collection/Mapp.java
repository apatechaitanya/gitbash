package com.udemy.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapp {
    Mapp() throws RuntimeException{

    }
    public static void main(String[] args) {

        Map<Integer,String> m = new HashMap<>();
        m.put(1,"Chaitanya");
        m.put(2,"Chimaji");
        m.put(3,"Apate");
        Set<Integer>keys = m.keySet();
        for(Integer s:keys){
            System.out.println(m.get(s));
        }

    }
}
