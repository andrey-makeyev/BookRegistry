package com.bookregistry.services;

import com.bookregistry.models.Author;
import com.bookregistry.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    protected AuthorRepository authorRepository;
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }
    public Set<Author> findByAuthorId(String authorId) {
        return authorRepository.findByAuthorId(authorId);
    }
}

