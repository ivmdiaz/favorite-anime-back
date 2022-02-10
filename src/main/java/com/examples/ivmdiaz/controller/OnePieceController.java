package com.examples.ivmdiaz.controller;

import com.examples.ivmdiaz.dto.CharacterDto;
import com.examples.ivmdiaz.dto.onepiece.CharacterDetailOnePieceDto;
import com.examples.ivmdiaz.service.OnePieceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/one-piece")
@AllArgsConstructor
public class OnePieceController {

    private final OnePieceService mOnePieceService;

    @GetMapping("/character")
    public List<CharacterDto> getAllCharacters() {
        return mOnePieceService.getAllCharacters();
    }

    @GetMapping("/character/{characterId}")
    public CharacterDetailOnePieceDto getCharacterDetailById(@PathVariable(name = "characterId") Integer characterId) {
        return mOnePieceService.getCharacterDetailOnePieceById(characterId);
    }

}
