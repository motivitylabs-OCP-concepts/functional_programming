package com.motivity.ConsumerChaining;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee2{
    String name;
    double sal;

    public Employee2(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }
}
public class Example {
    public static void main(String[] args) {
      ArrayList<Employee2>   l = new ArrayList<>();
      populate(l);
        BiConsumer<Employee2,Double> c = (e,d)->e.sal=e.sal+d;
        for (Employee2 e: l){
            c.accept(e,200.0);

        }
        for (Employee2 e : l){
            System.out.println("Employee name : "+e.name);
            System.out.println("Employee name : "+e.sal);
            System.out.println();
        }

    }
    public  static void populate (ArrayList <Employee2> l){
        l.add(new Employee2("john",123));
        l.add(new Employee2("cena",1230));
        l.add(new Employee2("wwe",103));
        l.add(new Employee2("Rko",1293));
    }
}
