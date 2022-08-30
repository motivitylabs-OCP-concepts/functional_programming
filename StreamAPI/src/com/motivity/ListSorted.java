package com.motivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorted {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("zczcx");
        l.add("a");
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l.contains("a"));
        System.out.println(l);
    }
}
