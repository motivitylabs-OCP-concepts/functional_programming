package com.motivity.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToSetConversion {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(56);
        numbers.add(67);
        numbers.add(10);
        numbers.add(167);
        numbers.add(180);
        System.out.println(numbers);
        Stream<Integer> stream = numbers.stream();
        Set<Integer> set = stream.collect(Collectors.toSet());
        System.out.println("Set Values = "+set);
    }
}
