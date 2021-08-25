package com.barclays.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.entity.Book;
import com.barclays.repos.BookRepository;
import com.barclays.services.BookService;

@Service
public class BookServiceImpl extends BaseServiceImpl<Book> implements BookService{
    
    @Autowired
    private BookRepository bookRepository;
  
    @Override
    protected BookRepository getRepository() {
        return bookRepository;
    }
}
