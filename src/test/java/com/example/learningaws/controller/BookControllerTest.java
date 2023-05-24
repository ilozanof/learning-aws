package com.example.learningaws.controller;

import com.example.learningaws.model.Book;
import com.example.learningaws.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author i.fernandez@nchain.com
 * Copyright (c) 2018-2023 nChain Ltd
 */
@WebMvcTest(controllers = BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void statusIs200() throws Exception {
        when(bookService.getBooks())
                .thenReturn(new ArrayList<>(){{add(new Book("0", "Dummy title", "Dummy Author"));}});
        mockMvc.perform(get("/v1/books")
                .contentType("application/json"))
                .andExpect(status().isOk());
    }
}
