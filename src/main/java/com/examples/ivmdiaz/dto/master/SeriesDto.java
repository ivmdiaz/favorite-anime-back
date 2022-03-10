package com.examples.ivmdiaz.dto.master;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SeriesDto {
    private KeyValueDto category;
    private String code;
    private String name;
    private String author;
    private LocalDate created;
}
