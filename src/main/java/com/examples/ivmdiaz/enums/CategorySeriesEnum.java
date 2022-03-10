package com.examples.ivmdiaz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CategorySeriesEnum {

    ANIME("AN01", "Anime");

    private final String code;
    private final String name;
}
