package com.examples.ivmdiaz.dto;

import lombok.Data;

import java.util.List;

@Data
public class LocationDto {

    private String code;
    private String name;
    private String summary;
    private List<GalleryDto> gallery;
}
