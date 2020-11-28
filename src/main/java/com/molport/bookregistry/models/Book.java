package com.molport.bookregistry.models;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Obligāts lauks!")
    private String title;
    @NotNull(message = "Obligāts lauks! Tikai cipari!")
    private String text;
    private int year;
    @NotBlank(message = "Obligāts lauks!")
    private String author;

    public Book(String booktitle, String booktext, int bookyear, String bookauthor) {
        this.title = booktitle;
        this.text = booktext;
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
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
