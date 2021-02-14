package com.bookregistry.models;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="book")
@Transactional
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @NotBlank(message = "Obligāts lauks!")
    private String title;

    @Column(name = "year")
    @NotNull(message = "Obligāts lauks!")
    // @Pattern(regexp = "^[0-9]*$", message = "Tikai veselie skaitļi!")
    @PositiveOrZero(message = "Tikai pozitīivie skaitļi!")
    @Min(value = 1377, message = "Gadam jābūt no 1377 līdz 2021!")
    @Max(value = 2021, message = "Gadam jābūt no 1377 līdz 2021!")
    private int year;

    @Column(name = "publisher")
    @NotBlank(message = "Obligāts lauks!")
    private String publisher;

    @Column(name = "author_id")
    private int authorId;

    @OneToMany(mappedBy="book", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Author> authors;

    public Book() {
    }

    public Book(Long id, String title, int year, String publisher, int authorId, Author authors) {
        super();
        this.id = id;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        this.authorId = authorId;
        this.authors = (Set<Author>) authors;
    }
 /*   public String getAuthorName() {
        return authors != null ? authors.getAuthorName() : "<none>";
    } */


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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Author getAuthor() {
    return (Author) authors;
    }

    public void setAuthor(Author authors) {
        this.authors = (Set<Author>) authors;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }


    @Override
    public String toString() {
        if (this.authors == null) {
            return "Book [id=" + id + ", title=" + title + ", year=" + year + ", publisher =" + publisher + "]";
        } else {
            return "Book [id=" + id + ", title=" + title + ", year=" + year + ", publisher =" + publisher + "author =" + this.authors + "]";
        }
    }
}