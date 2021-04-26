package ru.netplogy.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class Book extends Product {

    private String author;

    private Book(int id, String name, int price) {
        super(id, name, price);
    }

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public boolean matches(String text) {
        return super.matches(text) || ( author != null && author.equalsIgnoreCase(text));
    }
}
