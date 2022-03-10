package com.examples.ivmdiaz.dto.master;

import com.examples.ivmdiaz.model.master.CharacterRelationship;
import com.examples.ivmdiaz.model.master.CharacterSummary;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.modelmapper.ModelMapper;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
public class CharacterDatailDto {

    private CharacterDto character;
    private LocationDto location;
    private String introduction;
    private String history;
    private String abilities;

    private List<ImageDto> gallery;
    private List<TagDto> tags;
    private List<CharacterRelationshipDto> relationships;

    public CharacterDatailDto(final CharacterDatailDto other) {
        this.character = other.getCharacter();
        this.location = other.getLocation();
        this.introduction = other.getIntroduction();
        this.history = other.getHistory();
        this.abilities = other.getAbilities();
        this.gallery = other.getGallery();
        this.tags = other.getTags();
        this.relationships = other.getRelationships();
    }

    public CharacterDatailDto(CharacterSummary cs, List<CharacterRelationship> cr) {
        if (Objects.nonNull(cs)) {
            if (Objects.nonNull(cs.getCharacter())) {
                this.character = new ModelMapper().map(cs.getCharacter(), CharacterDto.class);
            }
            if (Objects.nonNull(cs.getLocation())) {
                this.location = new ModelMapper().map(cs.getLocation(), LocationDto.class);
            }
            this.introduction = cs.getIntroduction();
            this.history = cs.getHistory();
            this.abilities = cs.getAbilities();

            if (!CollectionUtils.isEmpty(cs.getGallery())) {
                this.gallery = cs.getGallery()
                        .stream().map(x -> new ModelMapper().map(x, ImageDto.class)).collect(Collectors.toList());
            }
            if (!CollectionUtils.isEmpty(cs.getTags())) {
                this.tags = cs.getTags()
                        .stream().map(x -> new ModelMapper().map(x, TagDto.class)).collect(Collectors.toList());
            }
        }
        if (!CollectionUtils.isEmpty(cr)) {
            this.relationships = cr.stream().map(CharacterRelationshipDto::new).collect(Collectors.toList());
        }
    }
}
