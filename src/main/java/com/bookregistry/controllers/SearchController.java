/* package com.bookregistry.controllers;

import BookServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Author;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

public class SearchController extends BookServiceImpl implements WebMvcConfigurer {
    private static final Logger logger = LoggerFactory.getLogger(SearchController.class);
    @PersistenceContext
    private EntityManager em;

    public Author findByAuthorId(String authorName) {
        try {
            return em.createQuery("SELECT a FROM Author a WHERE a.name = :name", Author.class)
                    .setParameter("name", authorName)
                    .getSingleResult();
        } catch (NoResultException e) {
            logger.error(String.format("author (name: %s) not found", authorName), e);
            return null;
        }
    }
} */
