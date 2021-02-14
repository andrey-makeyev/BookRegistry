package com.bookregistry.services;

import com.bookregistry.models.Book;
import com.bookregistry.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    protected BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
    public List<Book> findByKeyword(String keyword) {
        return bookRepository.findByKeyword(keyword);
    }

}