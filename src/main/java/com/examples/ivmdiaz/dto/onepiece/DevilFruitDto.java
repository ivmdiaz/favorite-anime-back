package com.examples.ivmdiaz.dto.onepiece;

import com.examples.ivmdiaz.model.onepiece.DevilFruit;
import lombok.Data;
import org.modelmapper.ModelMapper;

import java.util.Objects;

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

    public DevilFruitDto(DevilFruit df) {
        if (Objects.nonNull(df.getType())) {
            this.type = new ModelMapper().map(df.getType(), DevilFruitTypeDto.class);
        }

        this.code = df.getCode();
        this.name = df.getName();
        this.meaning = df.getMeaning();
        this.iconUrl = df.getIconUrl();
        this.imageUrl = df.getImageUrl();
        this.imageName = df.getImageName();
        this.imageSummary = df.getImageSummary();
        this.history = df.getHistory();
    }
}
