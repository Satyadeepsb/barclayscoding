package com.barclays.repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
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
    
    
    @Test
    public void testFindByName() {
        Book bookLocal =  new Book("Iron Man", "Satyadeep");
        entityManager.persist(bookLocal);
        List<Book> books = repository.findByName("Iron Man");
        assertThat(books.stream().map(Book::getName).filter(b -> "Iron Man".equals(b)).findAny().orElse("")).isEqualTo("Iron Man");
      }
    
    @Test
    public void testGetAll() {
        Book bookLocal1 =  new Book("Iron Man", "Satyadeep");
        Book bookLocal2 =  new Book("Iron Man2", "Satyadeep");
        Book bookLocal3 =  new Book("Iron Man3", "Satyadeep");
        entityManager.persist(bookLocal1);
        entityManager.persist(bookLocal2);
        entityManager.persist(bookLocal3);
        List<Book> books = repository.findAll();
        assertThat(books.size()).isEqualTo(3);
      }
    
   
    
    
     
    
}