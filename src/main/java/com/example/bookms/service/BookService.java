package com.example.bookms.service;

import com.example.bookms.model.Book;
import com.example.bookms.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BookService {

@Autowired
    BookRepository bookRepository;
    public List<Book> getAllBook()
    {
        List<Book> books = new ArrayList<Book>();
        bookRepository.findAll().forEach(book -> books.add(book));
        return books;
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).get();
    }

    public void delete(int id) {
        bookRepository.deleteById(id);

    }

    public void saveOrUpdate(Book book) {
        bookRepository.save(book);

    }
}
