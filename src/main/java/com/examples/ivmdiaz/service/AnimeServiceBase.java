package com.examples.ivmdiaz.service;

import com.examples.ivmdiaz.dto.CharacterDatailDto;
import com.examples.ivmdiaz.dto.CharacterDto;
import com.examples.ivmdiaz.model.CharacterGallery;
import com.examples.ivmdiaz.model.CharacterRelationship;
import com.examples.ivmdiaz.model.CharacterSummary;
import com.examples.ivmdiaz.model.CharacterTag;
import com.examples.ivmdiaz.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public abstract class AnimeServiceBase {

    protected CharacterRepository mCharacterRepository;
    protected CharacterSummaryRepository mCharacterSummaryRepository;
    protected CharacterGalleryRepository mCharacterGalleryRepository;
    protected CharacterTagRepository mCharacterTagRepository;
    protected CharacterRelationshipRepository mCharacterRelationshipRepository;

    protected List<CharacterDto> getAllCharacters(final String animeCode) {
        return mCharacterRepository.findByAnimeCode(animeCode).stream()
                .map(x -> new ModelMapper().map(x, CharacterDto.class))
                .collect(Collectors.toList());
    }

    protected CharacterDatailDto getCharacterDetailById(final Integer id) {
        final CharacterSummary cs = mCharacterSummaryRepository.findById(id);
        final List<CharacterGallery> cg = mCharacterGalleryRepository.findCharacterGalleriesByCharacterId(id);
        final List<CharacterTag> ct = mCharacterTagRepository.findCharacterTagsByCharacterId(id);
        final List<CharacterRelationship> cr = mCharacterRelationshipRepository.findCharacterRelationshipsByCharacterId(id);
        return new CharacterDatailDto(cs, cg, ct, cr);
    }

    @Autowired
    public void setmCharacterRepository(CharacterRepository mCharacterRepository) {
        this.mCharacterRepository = mCharacterRepository;
    }

    @Autowired
    public void setmCharacterSummaryRepository(CharacterSummaryRepository mCharacterSummaryRepository) {
        this.mCharacterSummaryRepository = mCharacterSummaryRepository;
    }

    @Autowired
    public void setmCharacterGalleryRepository(CharacterGalleryRepository mCharacterGalleryRepository) {
        this.mCharacterGalleryRepository = mCharacterGalleryRepository;
    }

    @Autowired
    public void setmCharacterTagRepository(CharacterTagRepository mCharacterTagRepository) {
        this.mCharacterTagRepository = mCharacterTagRepository;
    }

    @Autowired
    public void setmCharacterRelationshipRepository(CharacterRelationshipRepository mCharacterRelationshipRepository) {
        this.mCharacterRelationshipRepository = mCharacterRelationshipRepository;
    }
}
