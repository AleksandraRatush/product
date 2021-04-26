package ru.netplogy.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class Smartphone extends Product {

    private String manufacturer;

    private Smartphone(int id, String name, int price) {
        super(id, name, price);
    }

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

    public boolean matches(String text) {
        return super.matches(text) || (manufacturer != null && manufacturer.equalsIgnoreCase(text));
    }
}
