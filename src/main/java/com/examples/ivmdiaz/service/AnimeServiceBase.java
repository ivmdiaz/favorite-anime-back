package com.examples.ivmdiaz.service;

import com.examples.ivmdiaz.dto.master.CharacterDatailDto;
import com.examples.ivmdiaz.dto.master.CharacterDto;
import com.examples.ivmdiaz.model.master.CharacterRelationship;
import com.examples.ivmdiaz.model.master.CharacterSummary;
import com.examples.ivmdiaz.repository.master.CharacterRelationshipRepository;
import com.examples.ivmdiaz.repository.master.CharacterRepository;
import com.examples.ivmdiaz.repository.master.CharacterSummaryRepository;
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
    protected CharacterSummaryRepository characterSummaryRepository;
    protected CharacterRelationshipRepository characterRelationshipRepository;

    protected List<CharacterDto> getAllCharacters(final String seriesCode) {
        return characterRepository.findBySeriesCode(seriesCode).stream()
                .map(x -> new ModelMapper().map(x, CharacterDto.class))
                .collect(Collectors.toList());
    }

    protected CharacterDatailDto getCharacterDetailById(final Integer id) {
        CharacterDatailDto resultDto = null;
        final CharacterSummary cs = characterSummaryRepository.findByCharacterId(id);
        final List<CharacterRelationship> cr = characterRelationshipRepository.findByCharacterId(id);
        if(Objects.nonNull(cs) && Objects.nonNull(cr)) {
            resultDto = new CharacterDatailDto(cs, cr);
        }
        return resultDto;
    }

    @Autowired
    public void setCharacterRepository(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Autowired
    public void setCharacterSummaryRepository(CharacterSummaryRepository characterSummaryRepository) {
        this.characterSummaryRepository = characterSummaryRepository;
    }

    @Autowired
    public void setCharacterRelationshipRepository(CharacterRelationshipRepository characterRelationshipRepository) {
        this.characterRelationshipRepository = characterRelationshipRepository;
    }
}
