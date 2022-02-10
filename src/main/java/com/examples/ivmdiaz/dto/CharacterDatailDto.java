package com.examples.ivmdiaz.dto;

import com.examples.ivmdiaz.model.*;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.modelmapper.ModelMapper;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
@SuperBuilder(toBuilder = true)
public class CharacterDatailDto {

    private CharacterDto character;
    private List<GalleryDto> gallery;
    private List<TagDto> tags;
    private List<CharacterRelationshipDto> relationships;
    private LocationDto location;
    private String introduction;
    private String history;
    private String abilities;
    private String imageUrl;

    public CharacterDatailDto(CharacterSummary cs, List<CharacterGallery> cg, List<CharacterTag> ct, List<CharacterRelationship> cr) {
        if (Objects.nonNull(cs.getCharacter())) {
            this.character = new ModelMapper().map(cs.getCharacter(), CharacterDto.class);
        }
        if (Objects.nonNull(cs.getLocation())) {
            this.location = new ModelMapper().map(cs.getLocation(), LocationDto.class);
        }
        if (!CollectionUtils.isEmpty(cg)) {
            this.gallery = cg.stream().map(x -> new ModelMapper().map(x, GalleryDto.class)).collect(Collectors.toList());
        }
        if (!CollectionUtils.isEmpty(ct)) {
            this.tags = ct.stream().map(x -> new ModelMapper().map(x.getTag(), TagDto.class)).collect(Collectors.toList());
        }
        if (!CollectionUtils.isEmpty(cr)) {
            this.relationships = cr.stream().map(CharacterRelationshipDto::new).collect(Collectors.toList());
        }

        this.introduction = cs.getIntroduction();
        this.history = cs.getHistory();
        this.abilities = cs.getAbilities();
        this.imageUrl = cs.getImageUrl();
    }
}
