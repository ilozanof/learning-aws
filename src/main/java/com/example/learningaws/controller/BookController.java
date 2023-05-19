package com.example.learningaws.controller;

import com.example.learningaws.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author i.fernandez@nchain.com
 * Copyright (c) 2018-2023 nChain Ltd
 */
@RestController
@RequestMapping(path = "/v1/books")
public class BookController {

    @GetMapping(path = "", produces="application/json")
    public List<Book> getBooks() {
        return new ArrayList<>() {
            {add(new Book("1", "Foundation", "Isaac Asimov"));}
            {add(new Book("2", "Kafka in the shore", "Haruki Murakami"));}
        };
    }

}
