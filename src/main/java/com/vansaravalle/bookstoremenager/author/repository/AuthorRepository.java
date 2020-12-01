package com.vansaravalle.bookstoremenager.author.repository;

import com.vansaravalle.bookstoremenager.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
