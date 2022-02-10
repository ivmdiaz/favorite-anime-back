package com.examples.ivmdiaz.service;

import com.examples.ivmdiaz.dto.CharacterDto;
import com.examples.ivmdiaz.dto.onepiece.CharacterDetailOnePieceDto;

import java.util.List;

public interface OnePieceService {

    List<CharacterDto> getAllCharacters();

    CharacterDetailOnePieceDto getCharacterDetailOnePieceById(Integer id);
}
