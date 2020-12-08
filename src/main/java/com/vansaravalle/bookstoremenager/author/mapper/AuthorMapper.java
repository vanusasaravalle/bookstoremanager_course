package com.vansaravalle.bookstoremenager.author.mapper;

import com.vansaravalle.bookstoremenager.author.dto.AuthorDto;
import com.vansaravalle.bookstoremenager.author.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toModel(AuthorDto authorDto);

    AuthorDto toDto (Author author);
}
