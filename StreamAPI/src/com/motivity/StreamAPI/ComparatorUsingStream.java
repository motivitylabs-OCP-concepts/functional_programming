package com.motivity.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employee{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id ;
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparatorUsingStream {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(23);
        l.add(26);
        l.add(13);
        l.add(3);
        System.out.println(l);
        Comparator<Integer> c =(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
        Collections.sort(l,c);
        l.stream().forEach(System.out::println);

        ArrayList<Integer> e = new ArrayList<>();

    }
}
