package com.examples.ivmdiaz.dto.anime;

import com.examples.ivmdiaz.dto.master.ImageDto;
import lombok.Data;

@Data
public class DevilFruitTypeDto {
    private String code;
    private String name;
    private String summary;
    private ImageDto image;
}
