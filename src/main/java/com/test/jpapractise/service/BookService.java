package com.test.jpapractise.service;

import com.test.jpapractise.entity.Book;
import com.test.jpapractise.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Page<Book> page(Pageable pageable) {
        return bookRepository.findAll(pageable);

    }
}
