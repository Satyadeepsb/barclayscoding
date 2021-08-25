package com.barclays.repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.barclays.entity.Book;
import com.barclays.repos.BookRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class BookRepositoryTests {
    
    @Autowired
    private TestEntityManager entityManager;
    
    @Autowired
    private BookRepository repository;
    
    @Test
    public void testSaveNewBook() {
        Book bookLocal =  new Book("Iron Man", "Satyadeep");
        entityManager.persist(bookLocal);
        Book bookDB =   repository.findById(1L).orElse(null);
        assertThat(bookLocal.equals(bookDB));
      }
    
    
}