package com.vansaravalle.bookstoremenager.user.enums;


import lombok.Getter;

@Getter
public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    private String description;


    Gender(String description) {
        this.description = description;
    }
}
