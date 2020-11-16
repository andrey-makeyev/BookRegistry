package com.molport.bookregistry.repo;

import com.molport.bookregistry.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
