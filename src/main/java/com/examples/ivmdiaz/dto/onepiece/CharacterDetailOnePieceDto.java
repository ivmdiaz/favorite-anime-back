package com.examples.ivmdiaz.dto.onepiece;

import com.examples.ivmdiaz.dto.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
public class CharacterDetailOnePieceDto extends CharacterDatailDto {

    private DevilFruitDto devilFruit;
}
