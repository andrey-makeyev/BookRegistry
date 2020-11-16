package com.molport.bookregistry.service;

import com.molport.bookregistry.models.Book;
import com.molport.bookregistry.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    protected BookRepository bookRepository;

    public List<Book> findByKeyword(String keyword) {
        return bookRepository.findByKeyword(keyword);

    }
}
