package com.vansaravalle.bookstoremenager.author.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@NoArgsConstructor
public class AuthorDto {

    private Long id;

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String name;

    @NotNull
    @Max(120)
    private Integer age;

    public AuthorDto(Long id, @NotNull @NotEmpty @Size(max = 255) String name,
                     @NotNull @Max(120) Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
