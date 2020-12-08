package com.vansaravalle.bookstoremenager.author.service;

import com.vansaravalle.bookstoremenager.author.mapper.AuthorMapper;
import com.vansaravalle.bookstoremenager.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final static AuthorMapper authorMapper =AuthorMapper.INSTANCE;

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorService (AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }
}
