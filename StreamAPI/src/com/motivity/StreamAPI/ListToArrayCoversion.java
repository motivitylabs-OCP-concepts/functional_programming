package com.motivity.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListToArrayCoversion {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(178);
        numbers.add(10);
        numbers.add(1270);
        numbers.add(50);
        numbers.add(50);
        System.out.println(numbers);
        Stream<Integer> stream = numbers.stream();
        Object[] intArray = stream.toArray();
        for (Object element : intArray) {
            System.out.print(element + " ");
        }
    }
}
