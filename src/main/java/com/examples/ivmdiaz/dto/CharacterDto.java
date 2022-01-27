package com.examples.ivmdiaz.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CharacterDto {

    private Integer id;
    private String name;
    private String alias;
    private LocalDate birthday;
    private String imageUrl;
}
