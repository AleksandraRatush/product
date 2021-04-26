package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.repository.ProductManager;
import ru.netplogy.domain.Book;
import ru.netplogy.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    void searchByWhenEmpty() {
        ProductManager productManager = new ProductManager();
        Product[] result = productManager.searchBy("тест");
        assertArrayEquals(new Product[0], result);
    }

    @Test
    void searchByWhenBookName() {
        ProductManager productManager = new ProductManager();
        Product[] result = productManager.searchBy("Дурная кровь");
        Product[] expected = {new Book(1, "Дурная кровь", 379, "Роберт Гэлбрейт")};
        assertArrayEquals(result, expected);
    }

    @Test
    void searchByWhenBookNameLower() {
        ProductManager productManager = new ProductManager();
        Product[] result = productManager.searchBy("дурная кровь");
        Product[] expected = {new Book(1, "Дурная кровь", 379, "Роберт Гэлбрейт")};
        assertArrayEquals(result, expected);
    }

    @Test
    void searchByWhenBookNameOrAuthor() {
        ProductManager productManager = new ProductManager();
        Product[] result = productManager.searchBy("Гузель Яхина");
        Product[] expected = {new Book(3, "Эшелон на Самарканд",
                399, "Гузель Яхина"),
                new Book(4, "Гузель Яхина",
                        399, "Эшелон на Самарканд")};
        assertArrayEquals(result, expected);
    }
}