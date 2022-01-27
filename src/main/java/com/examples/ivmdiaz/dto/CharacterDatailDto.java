package com.examples.ivmdiaz.dto;

import lombok.Data;

import java.util.List;

@Data
public class CharacterDatailDto {

    private CharacterDto character;
    private List<GalleryDto> gallery;
    private List<TagDto> tags;
    private List<RelationshipDto> relationships;
    private LocationDto location;
    private DevilFruitDto devilFruit;
    private String introduction;
    private String history;
    private String abilities;
    private String imageUrl;
}
