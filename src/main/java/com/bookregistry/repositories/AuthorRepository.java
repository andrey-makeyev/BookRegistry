package com.bookregistry.repositories;

import com.bookregistry.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

   @Query("SELECT a FROM Author a WHERE CONCAT(a.name, ' ') LIKE %?1%")
   //@Query("SELECT a FROM Author a WHERE a.name = :name")
   List<Author> findByAuthorId(@Param("authorId") String authorId);
}