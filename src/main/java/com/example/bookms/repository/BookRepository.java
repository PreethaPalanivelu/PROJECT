package com.example.bookms.repository;

import com.example.bookms.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book,Integer> {
}
