package com.test.jpapractise.repository;

import com.test.jpapractise.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {

}
