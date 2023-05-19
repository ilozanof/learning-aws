package com.example.learningaws.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author i.fernandez@nchain.com
 * Copyright (c) 2018-2023 nChain Ltd
 */
@Data
@AllArgsConstructor
public class Book {
    private String id;
    private String title;
    private String author;
}
