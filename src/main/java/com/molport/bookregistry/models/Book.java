package com.molport.bookregistry.models;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private int year;
   // @ManyToOne
   // @JoinColumn(name = "author", nullable = false)
    private String author;

    public Book(String booktitle, int bookyear, String bookauthor) {
        this.title = booktitle;
        this.year = bookyear;
        this.author = bookauthor;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;

    }
}
