package com.bookregistry.models;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="author")
@Transactional

public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long author_id;

    @Column(name = "name")
    private String name;
    @NotBlank(message = "Obligāts lauks!")

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "author_id", insertable = false, updatable = false)
    private Book book;

    public Author() {
    }

    public Author(Long author_id, String name, Book book) {
        super();
        this.author_id = author_id;
        this.name = name;
        this.book = book;
    }

  /* public String getAuthorName() {
        return name != null ? this.name : "<none>";
    } */

    public Long getId() {
        return author_id;
    }

    public void setId(Long author_id) {
        this.author_id = author_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(author_id, author.author_id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(author_id);
    }

    @Override
  public String toString() {
       return "{Author [name=" + name + "]}" ;
   }
}