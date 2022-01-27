package com.examples.ivmdiaz.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimeDto {

    private String code;
    private String name;
    private String author;
    private LocalDate created;
}
