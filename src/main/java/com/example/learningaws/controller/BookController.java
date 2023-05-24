package com.example.learningaws.controller;

import com.example.learningaws.model.Book;
import com.example.learningaws.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author i.fernandez@nchain.com
 * Copyright (c) 2018-2023 nChain Ltd
 */
@RestController
@RequestMapping(path = "/v1/books")
public class BookController {

    BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
        this.bookService.addBook(new Book("1", "Foundation", "Isaac Asimov"));
        this.bookService.addBook(new Book("2", "Kafka in the shore", "Haruki Murakami"));
    }

    @GetMapping(path = "", produces="application/json")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping(path = "")
    public ResponseEntity<Void> addBook(@RequestBody Book book) {
        try {
            bookService.addBook(book);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
