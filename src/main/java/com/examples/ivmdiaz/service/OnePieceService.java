package com.examples.ivmdiaz.service;

import com.examples.ivmdiaz.dto.CharacterDatailDto;
import com.examples.ivmdiaz.dto.CharacterDto;
import com.examples.ivmdiaz.dto.DevilFruitDto;
import com.examples.ivmdiaz.dto.LocationDto;

import java.util.List;

public interface OnePieceService {

    List<CharacterDto> getAllCharacters();

    List<CharacterDatailDto> getCharacterDetailById(Long id);

    List<DevilFruitDto> getAllDevilFruit();
}
