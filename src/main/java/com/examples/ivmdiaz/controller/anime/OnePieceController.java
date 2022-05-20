package com.examples.ivmdiaz.controller.anime;

import com.examples.ivmdiaz.dto.ResponseWrapperDto;
import com.examples.ivmdiaz.dto.master.CharacterDto;
import com.examples.ivmdiaz.dto.anime.CharacterDetailOnePieceDto;
import com.examples.ivmdiaz.service.OnePieceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/anime/one-piece")
@AllArgsConstructor
public class OnePieceController {

    private final OnePieceService mOnePieceService;

    @GetMapping("/character")
    public ResponseWrapperDto<List<CharacterDto>> getAllCharacters() {
        return new ResponseWrapperDto<>(mOnePieceService.getAllCharacters());
    }

    @GetMapping("/character/{characterId}")
    public ResponseWrapperDto<CharacterDetailOnePieceDto> getCharacterDetailById(
            @PathVariable(name = "characterId") Integer characterId) {
        return new ResponseWrapperDto<>(mOnePieceService.getCharacterDetailOnePieceById(characterId));
    }

}
