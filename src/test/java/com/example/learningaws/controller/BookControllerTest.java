package com.example.learningaws.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
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

    @Test
    public void statusIs200() throws Exception {
        mockMvc.perform(get("/v1/books")
                .contentType("application/json"))
                .andExpect(status().isOk());
    }
}
