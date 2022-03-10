package com.examples.ivmdiaz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AnimeEnum {

    ONE_PIECE("OP01", "One Piece");

    private final String code;
    private final String name;
}
