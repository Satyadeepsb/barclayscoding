package com.barclays.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.entity.Book;
import com.barclays.services.BookService;
import com.barclays.utils.Paths;

@RestController
public class BookController {
    
    @Autowired
    private BookService bookService;
    
    @GetMapping(Paths.REST_API_BOOKS + "/getAll")
    public List<Book> getAllBooks() {
        return bookService.getAll();
    }
    
}
