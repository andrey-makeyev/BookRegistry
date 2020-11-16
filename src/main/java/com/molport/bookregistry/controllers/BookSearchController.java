package com.molport.bookregistry.controllers;

import com.molport.bookregistry.models.Book;
import com.molport.bookregistry.service.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookSearchController extends BookServiceImpl {
    @GetMapping("/book/search")
    public String getBooks(Model model, String keyword) {
        if (keyword != null) {
            model.addAttribute("book", findByKeyword(keyword));
        }
        else {
            model.addAttribute("books", getBooks());
        }
        return "showpage";
    }
}
