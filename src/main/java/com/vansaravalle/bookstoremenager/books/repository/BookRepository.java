package com.vansaravalle.bookstoremenager.books.repository;

import com.vansaravalle.bookstoremenager.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
