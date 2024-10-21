package com.test.jpapractise.controller;

import com.test.jpapractise.entity.Book;
import com.test.jpapractise.entity.Person;
import com.test.jpapractise.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;


    @PostMapping("/create-book")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
//burada page 0-dan baslayir meselen 1 yaziramsa 2 seife gelecek demeli
    // size ise her seifede nece dene kitab olmasini isteyiremse odur
    @GetMapping("/page")
    public Page<Book> page(@RequestParam int page, @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        return bookService.page(pageable);
    }
}
