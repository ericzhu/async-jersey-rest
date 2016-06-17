package com.pluralsight.dao;

import com.pluralsight.model.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by eric on 16/06/2016.
 */
public class BookDao {
    private Map<String, Book> books;

    public BookDao() {
        books = new HashMap<>();
        Book book1 = new Book();
        book1.setTitle("Next big bulb");
        book1.setAuthor("Welliam Barack");
        book1.setIsbn("123456");
        book1.setId("1");

        Book book2 = new Book();
        book2.setTitle("Last big bulb");
        book2.setAuthor("Barak Obama");
        book2.setIsbn("654321");
        book2.setId("2");
        books.put(book1.getId(), book1);
        books.put(book2.getId(), book2);

    }

    public Collection<Book> getBooks() {
        return books.values();
    }

    public Book getBookById(String id) {
        return books.get(id);
    }
}
