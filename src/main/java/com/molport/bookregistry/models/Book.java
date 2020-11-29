package com.molport.bookregistry.models;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Obligāts lauks!")
    private String title;

    @Min(value = 1377, message = "Gadam jābūt no 1377 līdz 2020!")
    @Max(value = 2020, message = "Gadam jābūt no 1377 līdz 2020!")
    @PositiveOrZero(message = "Tikai pozitīivie skaitļi!")
    //@Pattern(regexp = "[\\s]*[0-9]*[1-9]+", message = "Tikai veselie skaitļi!")
    @NotNull(message = "Obligāts lauks!")
    private int year;

    @NotBlank(message = "Obligāts lauks!")
    private String publisher;

    @NotBlank(message = "Obligāts lauks!")
    private String author;

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

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
