/* package com.molport.bookregistry.repo;

import com.molport.bookregistry.models.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface BookPaginationRepository extends PagingAndSortingRepository<Book, Integer> {
    List<Book> findAllByTitle(String title, Pageable pageable);
    List<Book> findAllByYear(String year, Pageable pageable);
    List<Book> findAllByAuthor(String author, Pageable pageable);
} */
