package StudentFlatmapAndMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataTransformation {
    public static List<Student> getall(){
        return Stream.of(new Student(1,"vj","Vj@123", Arrays.asList("12345678765","12434565435678")),
        new Student(2,"vj","Vj@123", Arrays.asList("12345678765","12434565435678")),
        new Student(3,"vj","Vj@123", Arrays.asList("12345678765","12434565435678"))).collect(Collectors.toList());

    }
}
