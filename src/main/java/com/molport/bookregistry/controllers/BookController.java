package com.molport.bookregistry.controllers;

import com.molport.bookregistry.models.Book;
import com.molport.bookregistry.service.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BookController extends BookServiceImpl implements WebMvcConfigurer {

    @GetMapping("/book/show")
    public String show(Model model) {
        Iterable<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "showpage";
    }

    @GetMapping("/book/register")
    public String register(Model model) {
        model.addAttribute("book", new Book());
        return "registerpage";
    }

    @PostMapping("/book/register")
    public String bookRegister(@ModelAttribute @Valid Book book, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("book", book);
            return "registerpage";
        } else {
            bookRepository.save(book);
        }
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
    public String bookUpdate(@PathVariable(value = "id") long id, Model model) {
        Book book = bookRepository.findById(id).orElse((Book) Null);
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