package ru.netplogy.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Product {
    private int id;
    private String name;
    private int price;

    private Product() {
        super();
    }

    protected Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public boolean matches(String text) {
        return name != null && name.equalsIgnoreCase(text);
    }
}

