package com.molport.bookregistry.controllers;

import com.molport.bookregistry.models.Book;
import com.molport.bookregistry.service.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BookController extends BookServiceImpl {


    @GetMapping("/book/show")
    public String show(Model model) {
        Iterable<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "showpage";
    }

    @GetMapping("/book/register")
    public String register(Model model) {
        return "registerpage";
    }

    @PostMapping("/book/register")
    public String bookRegister(@RequestParam String booktitle, @RequestParam int bookyear, @RequestParam String bookauthor, Model model) {
        Book book = new Book(booktitle, bookyear, bookauthor);
        bookRepository.save(book);
        return "showpage";
    }

    @GetMapping("/book/{id}")
    public String bookDetails(@PathVariable(value = "id") long id, Model model) {
       /* if(bookRepository.existsById(id)) {
            return "";
        } */
        Optional<Book> book = bookRepository.findById(id);
        ArrayList<Book> result = new ArrayList<>();
        book.ifPresent(result::add);
        model.addAttribute("book", result);
        return "detailspage";
    }

    @GetMapping("/book/{id}/edit")
    public String bookEdit(@PathVariable(value = "id") long id, Model model) {
       /* if(bookRepository.existsById(id)) {
            return "";
        } */
        Optional<Book> book = bookRepository.findById(id);
        ArrayList<Book> result = new ArrayList<>();
        book.ifPresent(result::add);
        model.addAttribute("book", result);
        return "editpage";
    }

    private Object Null;
    @PostMapping("/book/{id}/edit")
    public String bookUpdate(@PathVariable(value = "id") long id, @RequestParam String booktitle, @RequestParam int bookyear, @RequestParam String bookauthor, Model model) {
        Book book = bookRepository.findById(id).orElse((Book) Null);
        book.setTitle(booktitle);
        book.setYear(bookyear);
        book.setAuthor(bookauthor);
        bookRepository.save(book);
        return "showpage";
    }

    @PostMapping("/book/{id}/delete")
    public String bookRemove(@PathVariable(value = "id") long id, Model model) {
        Book book = bookRepository.findById(id).orElse((Book) Null);
        bookRepository.delete(book);
        return "showpage";
    }
}