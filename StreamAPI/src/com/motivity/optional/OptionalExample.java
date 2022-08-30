package com.motivity.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String [] str = new String[10];
        str[5]="JAVA OPTIONAL CLASS EXAMPLE";
        str[0]="java";
        Optional<String> emty = Optional.empty();

        Optional<String> value =Optional.of(str[5]);
        value = Optional.of(str[0]);
        System.out.println("Filter value : "+value.filter((s)->s.equals("ABC")));
        System.out.println("Filter value : "+value.filter((s)->s.equals("java")));
    }
}
