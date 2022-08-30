package com.motivity.Streams.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentTest {
    public static void main(String[] args) {

        Function<Student, String> f = d -> {
            int marks = d.marks;
            String grade = "";
            if (marks > 80) grade = "A";
            else if (marks>=60) grade ="B";
            else grade="fail";
            return grade;
        };


    }
}
