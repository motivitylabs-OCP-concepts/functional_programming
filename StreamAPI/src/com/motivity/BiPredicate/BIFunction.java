package com.motivity.BiPredicate;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employeee{
    int  no ;
    String name;

    public Employeee(int no, String name) {
        this.no = no;
        this.name = name;
    }
}

public class BIFunction {
    public static void main(String[] args) {
        ArrayList<Employeee> l = new ArrayList<>();
        BiFunction<Integer,String,Employeee> f = (no,name)->new Employeee(no,name);
        l.add(f.apply(1,"venu"));
        l.add(f.apply(12,"renu"));
        l.add(f.apply(13,"menu"));
        l.add(f.apply(15,"denu"));
        for (Employeee e :l){
            System.out.println("employee number : "+ e.no);
            System.out.println("employee name : "+ e.name);
            System.out.println();
        }

    }
}
