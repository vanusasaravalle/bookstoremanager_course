package com.vansaravalle.bookstoremenager.author.builder;


import com.vansaravalle.bookstoremenager.author.dto.AuthorDto;
import lombok.Builder;

@Builder
public class AuthorDTOBuilder {

    @Builder.Default
    private final Long id = 1L;

    @Builder.Default
    private final String name =  "Vanusa Saravalle";

    @Builder.Default
    private final Integer age = 32;

    public AuthorDto buildAuthorDTO(){
        return new AuthorDto(id,name,age);
    }
}
