package com.example.learningaws.store;

import com.example.learningaws.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author i.fernandez@nchain.com
 * Copyright (c) 2018-2023 nChain Ltd
 */
public interface BookRepository extends JpaRepository<Book, String> {
}
