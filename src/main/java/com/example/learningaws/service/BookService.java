package com.example.learningaws.service;

import com.example.learningaws.model.Book;
import com.example.learningaws.store.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author i.fernandez@nchain.com
 * Copyright (c) 2018-2023 nChain Ltd
 */
@Service
public class BookService {

    private BookRepository repository;

    @Autowired
    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getBooks() {
        return repository.findAll();
    }

    public void addBook(Book book) {
        repository.save(book);
    }
}
