package com.motivity.pratice;

import java.util.ArrayList;
import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(4);
        s.add(7);
        System.out.println(s);

        List<Integer> k = new ArrayList<>();
        k.add(88);
        k.add(23);
        System.out.println(k);
        System.out.println(s.retainAll(k));
        System.out.println(s);
        System.out.println(k);
        s.retainAll(k);

    }
}
