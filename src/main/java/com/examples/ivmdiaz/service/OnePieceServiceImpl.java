package com.examples.ivmdiaz.service;

import com.examples.ivmdiaz.dto.master.CharacterDatailDto;
import com.examples.ivmdiaz.dto.master.CharacterDto;
import com.examples.ivmdiaz.dto.anime.CharacterDetailOnePieceDto;
import com.examples.ivmdiaz.dto.anime.DevilFruitDto;
import com.examples.ivmdiaz.enums.AnimeEnum;
import com.examples.ivmdiaz.model.anime.CharacterDevilFruit;
import com.examples.ivmdiaz.repository.anime.DevilFruitCharacterRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
@AllArgsConstructor
public class OnePieceServiceImpl extends AnimeServiceBase implements OnePieceService {

    private final DevilFruitCharacterRepository mDevilFruitCharacterRepository;

    @Override
    public List<CharacterDto> getAllCharacters() {
        return this.getAllCharacters(AnimeEnum.ONE_PIECE.getCode());
    }

    @Override
    public CharacterDetailOnePieceDto getCharacterDetailOnePieceById(final Integer id) {
        final CharacterDetailOnePieceDto resultDto = new CharacterDetailOnePieceDto(getCharacterDetailById(id));
        final CharacterDevilFruit cdf = this.mDevilFruitCharacterRepository.findByCharacterId(id);
        if (Objects.nonNull(cdf)) {
            log.info("the character {} have a devil fruit", id);
            resultDto.setDevilFruit(new DevilFruitDto(cdf.getDevilFruit()));
        }
        return resultDto;
    }

}
