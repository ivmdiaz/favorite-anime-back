package com.examples.ivmdiaz.dto.master;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CharacterDto {
    private Integer id;
    private ImageDto image;
    private String name;
    private String alias;
    private LocalDate birthday;
}
