package com.examples.ivmdiaz.dto.master;

import lombok.Data;

import java.util.List;

@Data
public class LocationDto {
    private String code;
    private String name;
    private String summary;
    private List<ImageDto> gallery;
}
