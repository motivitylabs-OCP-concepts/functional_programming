package com.motivity.SreamAPIPratice;

import com.motivity.StreamAPI.StreamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEg {
    public static void main(String[] args) {

       Stream.of(1,3,5,6,7,8,9,0).filter(i->i%2==0).forEach(System.out::println);
        System.out.println("**********************************************");
        Stream.of(1,3,5,6,7,8,9,0).filter(i1->i1%2==1).forEach(i1->System.out.println(i1));
        List<Integer> l = Stream.of(1,2,3,4,5,6,7,8,9,10).map(k->k*5).collect(Collectors.toList());
       // System.out.println(l);
        l.forEach(System.out::println);



        List<Book> b = new ArrayList<>();
        b.add(new Book("geetanjali ","rabindraNathTagore",123,123333.33));
        b.add(new Book ( "nightengleOfIndia","sarojiniNaidu",234,9876.78));
        b.add(new Book("the gentleMan","Nani ",1221,12222.22));

        b.stream().map(e->e.getAuthor()).forEach(System.out::println);
        b.stream().map(e->e.getPrice()).forEach(System.out::println);
        b.stream().map(e->e.getRating()).forEach(System.out::println);
        b.stream().filter(k->k.getPrice()>200).map(k->k.getName()).forEach(System.out::println);






    }
}




class Book{
    private String name;
    private String Author;
    private int price;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    public Book(String name, String author, int price, double rating) {
        this.name = name;
        Author = author;
        this.price = price;
        this.rating = rating;
    }
}

