package com.motivity.SreamAPIPratice;



import java.util.*;


public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(12,"bunny");
        m.put(11,"sunny");
        m.put(10,"munny");
        m.put(9,"dunny");
        System.out.println(m);


        m.entrySet().stream().filter(i->i.getKey()%2==0).forEach(i-> System.out.println(i));
     //List k = (List) m.entrySet().stream().sorted().collect(Collectors.toList());
     //  System.out.println(k);
        System.out.println("************************");
 List<Map.Entry<Integer,String>> entries = new ArrayList<>(m.entrySet());
 Collections.sort(entries,(q1,q2)->q2.getKey()- q1.getKey());
        System.out.println(entries);
        System.out.println(":::::::::::::::::::::::::::::::");

m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;");
m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);





        List<Employee> em= new ArrayList<>();
        em.add(new Employee("sunny",121,43434));
        em.add(new Employee("bunny",120,3434));
        em.add(new Employee("punny",119,434));
        System.out.println(em);
        System.out.println("+++++++++++");
        Collections.sort(em,(z1,z2)->z1.getSalary()- z2 .getSalary());
        System.out.println(em);
        System.out.println("=================");
        em.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);


    }
}
class Employee{
    private String name;
    private int id ;
    private int salary ;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
                
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
