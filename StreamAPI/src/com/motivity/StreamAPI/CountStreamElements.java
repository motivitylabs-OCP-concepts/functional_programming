package com.motivity.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountStreamElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(90);
        numbers.add(125);
        numbers.add(158);
        System.out.println(numbers);
        Stream<Integer> stream = numbers.stream();
        long count = stream.count();
        System.out.println("Total Values = "+count);

    }
}
