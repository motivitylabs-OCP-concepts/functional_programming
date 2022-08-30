package com.motivity.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinAndMax {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(700);
        numbers.add(120);
        numbers.add(15);
        Stream<Integer> stream = numbers.stream();
        int max_val = stream.max((x,y)->x>y?1:-1).get();
        System.out.println("Max Value : "+max_val);
        int min_val = numbers.stream().min((x,y)->x<y?-1:1).get();
        System.out.println("Min Value : "+min_val);
    }
}
