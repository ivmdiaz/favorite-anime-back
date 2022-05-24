package com.examples.ivmdiaz.service;

import com.examples.ivmdiaz.dto.master.CharacterDatailDto;
import com.examples.ivmdiaz.dto.master.CharacterDto;
import com.examples.ivmdiaz.model.master.CharacterDetail;
import com.examples.ivmdiaz.repository.master.CharacterRelationshipRepository;
import com.examples.ivmdiaz.repository.master.CharacterRepository;
import com.examples.ivmdiaz.repository.master.CharacterDetailRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
@Service
public abstract class AnimeServiceBase {

    protected CharacterRepository characterRepository;
    protected CharacterDetailRepository characterDetailRepository;
    protected CharacterRelationshipRepository characterRelationshipRepository;

    protected List<CharacterDto> getAllCharacters(final String seriesCode) {
        return characterRepository.findBySeriesCode(seriesCode).stream()
                .map(x -> new ModelMapper().map(x, CharacterDto.class))
                .collect(Collectors.toList());
    }

    protected CharacterDatailDto getCharacterDetailById(final Integer characterId) {
        CharacterDatailDto resultDto = null;
        final CharacterDetail detail = characterDetailRepository.findFirstByCharacterId(characterId);
        if(Objects.nonNull(detail)) {
            resultDto = new CharacterDatailDto(detail);
            resultDto.mapRelationships(characterRelationshipRepository.findByIdCharacterDetailId(detail.getId()));
        }
        return resultDto;
    }

    @Autowired
    public void setCharacterRepository(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Autowired
    public void setCharacterSummaryRepository(CharacterDetailRepository characterDetailRepository) {
        this.characterDetailRepository = characterDetailRepository;
    }

    @Autowired
    public void setCharacterRelationshipRepository(CharacterRelationshipRepository characterRelationshipRepository) {
        this.characterRelationshipRepository = characterRelationshipRepository;
    }
}
