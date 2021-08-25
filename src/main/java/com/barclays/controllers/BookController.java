package com.barclays.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    
    @GetMapping("/rest/api/books/getAll")
    public String getAllBooks() {
        return "";
    }
    
}
