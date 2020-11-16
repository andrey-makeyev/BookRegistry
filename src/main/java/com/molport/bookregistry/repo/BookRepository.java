package com.molport.bookregistry.repo;

import com.molport.bookregistry.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface BookRepository extends JpaRepository<Book, Long> {
        @Query(value = "value = select * from; Book b where b.title like %:keyword% or b.year like %:keyword% or b.author like %:keyword%", nativeQuery = true)
        List<Book> findByKeyword(@Param("keyword") String keyword);
}

