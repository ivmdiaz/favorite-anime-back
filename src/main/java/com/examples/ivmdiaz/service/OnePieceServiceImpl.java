package com.examples.ivmdiaz.service;

import com.examples.ivmdiaz.dto.CharacterDto;
import com.examples.ivmdiaz.dto.GalleryDto;
import com.examples.ivmdiaz.dto.onepiece.CharacterDetailOnePieceDto;
import com.examples.ivmdiaz.dto.onepiece.DevilFruitDto;
import com.examples.ivmdiaz.dto.onepiece.DevilFruitTypeDto;
import com.examples.ivmdiaz.model.onepiece.CharacterDevilFruit;
import com.examples.ivmdiaz.model.onepiece.DevilFruit;
import com.examples.ivmdiaz.repository.onepiece.DevilFruitCharacterRepository;
import com.examples.ivmdiaz.util.Constants;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
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
        return this.getAllCharacters(Constants.ONE_PIECE);
    }

    @Override
    public CharacterDetailOnePieceDto getCharacterDetailOnePieceById(final Integer id) {
        final CharacterDetailOnePieceDto resultDto = (CharacterDetailOnePieceDto) getCharacterDetailById(id);
        final CharacterDevilFruit cdf = this.mDevilFruitCharacterRepository.findByCharacterId(id);
        if (Objects.nonNull(cdf)) {
            log.info("the character {} have a devil fruit", id);
            resultDto.setDevilFruit(new DevilFruitDto(cdf.getDevilFruit()));
        }
        return resultDto;
    }

}
