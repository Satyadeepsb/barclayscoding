package com.barclays.services;

import java.util.List;

import com.barclays.entity.Book;


public interface BookService extends BaseService<Book>{
    public List<Book> findByBookName(String bookName);
}
