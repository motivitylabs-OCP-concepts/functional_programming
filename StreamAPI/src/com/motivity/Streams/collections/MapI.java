package com.motivity.Streams.collections;


import java.util.function.Function;

public class MapI {
    public static void main(String[] args) {

        Function<Integer , Integer> k = i->i*i;
        System.out.println(k.apply(4));
        Function<String ,Integer> f=s->s.length();
        System.out.println(f.apply("awsedfghjkoiuytgfrdesxdcfvg"));






    }
}