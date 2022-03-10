package com.examples.ivmdiaz.service;

import com.examples.ivmdiaz.dto.master.CharacterDto;
import com.examples.ivmdiaz.dto.anime.CharacterDetailOnePieceDto;

import java.util.List;

public interface OnePieceService {

    List<CharacterDto> getAllCharacters();

    CharacterDetailOnePieceDto getCharacterDetailOnePieceById(Integer id);
}
