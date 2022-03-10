package com.examples.ivmdiaz.dto.anime;

import com.examples.ivmdiaz.dto.master.CharacterDatailDto;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class CharacterDetailOnePieceDto extends CharacterDatailDto {

    private DevilFruitDto devilFruit;

    public CharacterDetailOnePieceDto(CharacterDatailDto dto) {
        super(dto);
    }
}
