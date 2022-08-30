import StudentFlatmapAndMap.DataTransformation;
import StudentFlatmapAndMap.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> s = DataTransformation.getall();
 //list<Student> covert list<String> -> data transformation
       //mapping : student -> student.getEmail();
        //student -> student.getmail() one to one mapping
        List<String> emails =s.stream().map(k->k.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        List<List<String>> ph =s.stream().map(t->t.getPhoneNo()).collect(Collectors.toList());
       System.out.println(ph);

       List<String> phno= s.stream().flatMap(i->i.getPhoneNo().stream()).collect(Collectors.toList());
       System.out.println(phno);



    }
}