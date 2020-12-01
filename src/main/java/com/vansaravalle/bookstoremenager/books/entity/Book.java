package com.vansaravalle.bookstoremenager.books.entity;

import com.vansaravalle.bookstoremenager.author.entity.Author;
import com.vansaravalle.bookstoremenager.entity.Auditable;
import com.vansaravalle.bookstoremenager.publisher.entity.Publisher;
import com.vansaravalle.bookstoremenager.user.entity.User;
import lombok.Data;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;

@Data
@Entity
public class Book extends Auditablegis {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private String isbn;

    @Column(columnDefinition = "integer default 0")
    private int pages;

    @Column(columnDefinition = "integer default 0")
    private int chapters;


    @ManyToOne(cascade = CascadeType.MERGE)
    private Author author;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Publisher publisher;

    @ManyToOne(cascade = CascadeType.MERGE)
    private User user;
}
