package com.examples.ivmdiaz.dto.master;

import com.examples.ivmdiaz.model.master.CharacterDetail;
import com.examples.ivmdiaz.model.master.CharacterRelationship;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
public class CharacterDatailDto {

    private Integer characterDetailId;
    private CharacterDto character;
    private LocationDto location;
    private String introduction;
    private String history;
    private String abilities;

    private List<ImageDto> gallery;
    private List<TagDto> tags;
    private List<CharacterRelationshipDto> relationships;

    public CharacterDatailDto(final CharacterDatailDto other) {
        this.characterDetailId = other.getCharacterDetailId();
        this.character = other.getCharacter();
        this.location = other.getLocation();
        this.introduction = other.getIntroduction();
        this.history = other.getHistory();
        this.abilities = other.getAbilities();
        this.gallery = other.getGallery();
        this.tags = other.getTags();
        this.relationships = other.getRelationships();
    }

    public CharacterDatailDto(final CharacterDetail detail) {
        if (Objects.nonNull(detail)) {
            this.characterDetailId = detail.getId();
            if (Objects.nonNull(detail.getCharacter())) {
                this.character = new ModelMapper().map(detail.getCharacter(), CharacterDto.class);
            }
            if (Objects.nonNull(detail.getLocation())) {
                this.location = new ModelMapper().map(detail.getLocation(), LocationDto.class);
            }
            this.introduction = detail.getIntroduction();
            this.history = detail.getHistory();
            this.abilities = detail.getAbilities();

            if (!CollectionUtils.isEmpty(detail.getGallery())) {
                this.gallery = detail.getGallery()
                        .stream().map(x -> new ModelMapper().map(x, ImageDto.class)).collect(Collectors.toList());
            }
            if (!CollectionUtils.isEmpty(detail.getTags())) {
                this.tags = detail.getTags()
                        .stream().map(x -> new ModelMapper().map(x, TagDto.class)).collect(Collectors.toList());
            }
        }

    }

    public void mapRelationships(final List<CharacterRelationship> relationships) {
        if (!CollectionUtils.isEmpty(relationships)) {
            this.relationships = relationships.stream().map(CharacterRelationshipDto::new).collect(Collectors.toList());
        }
    }
}
