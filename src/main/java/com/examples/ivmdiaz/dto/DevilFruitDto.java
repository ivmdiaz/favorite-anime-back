package com.examples.ivmdiaz.dto;

import lombok.Data;

@Data
public class DevilFruitDto {
    private String code;
    private String name;
    private String meaning;
    private String iconUrl;
    private String imageUrl;
    private String imageName;
    private String imageSummary;
    private String introduction;
    private String history;
    private DevilFruitTypeDto type;
}
