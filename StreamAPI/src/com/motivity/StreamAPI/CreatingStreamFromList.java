package com.motivity.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreamFromList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();

        fruits.add("APPLE");
        fruits.add("BANANA");
        fruits.add("CHERRY");

        Stream<String> stream = fruits.stream();
        Stream<String> stringStream = stream.map((value) -> { return value.toLowerCase(); });
        stringStream.forEach(System.out::println);
    }
}
