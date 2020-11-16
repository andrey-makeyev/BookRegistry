package com.molport.bookregistry.repo;

import com.molport.bookregistry.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

      @Query("SELECT b FROM Book b WHERE CONCAT(b.title, ' ', b.year, ' ', b.author) LIKE %?1%")
      List<Book> findByKeyword(@Param("keyword") String keyword);
}

