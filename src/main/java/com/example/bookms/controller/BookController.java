package com.example.bookms.controller;

import com.example.bookms.model.Book;
import com.example.bookms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/book")
    private List<Book> getAllBook()
    {
        return bookService.getAllBook();
    }

    @GetMapping("/book/{id}")
    private Book getBook(@PathVariable("id") int id)
    {
        return bookService.getBookById(id);
    }

    @DeleteMapping("/book/{id}")
    private void deleteBook(@PathVariable("id") int id)
    {
        bookService.delete(id);
    }

    @PostMapping("/book")
    private int saveBook(@RequestBody Book book)
    {
        bookService.saveOrUpdate(book);
        return book.getId();
    }

}
