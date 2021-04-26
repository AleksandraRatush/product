package ru.netology.repository;

import ru.netplogy.domain.Book;
import ru.netplogy.domain.Product;
import ru.netplogy.domain.Smartphone;

public class ProductManager {

    private Product[] products = {
            new Book(1, "Дурная кровь", 379, "Роберт Гэлбрейт" ),
            new Book(2, "Тезаурус эмоций. Руководство для писателей и сценаристов",
                    449,  "Бекка Пульизи" ),
            new Book(3, "Эшелон на Самарканд",
                    399,  "Гузель Яхина" ),
            new Book(4, "Гузель Яхина",
                    399,  "Эшелон на Самарканд"),

            new Smartphone(5, "Смартфон DEXP G450", 3199, "Dexp"),
            new Smartphone(6, "Смартфон Samsung Galaxy S20+", 45675, "Samsung"),
            new Smartphone(7, "Смартфон HONOR 10X Lite", 15699, "Honor")
    };

    public Product[] searchBy(String text) {
        int count = 0;
        for (Product product : products) {
            if (product.matches(text)) count++;
        }
        Product[] result = new Product[count];
        int j=0;
        for (Product product : products) {
            if (product.matches(text)) {
                result[j] = product;
                j++;
            }
        }
        return result;
    }


    public boolean matches(Product product, String search) {
        return product.matches(search);
    }


}
