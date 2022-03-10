package com.examples.ivmdiaz.dto.anime;

import com.examples.ivmdiaz.dto.master.ImageDto;
import com.examples.ivmdiaz.model.anime.DevilFruit;
import lombok.Data;
import org.modelmapper.ModelMapper;

import java.util.Objects;

@Data
public class DevilFruitDto {
    private String name;
    private String meaning;
    private String introduction;
    private String history;
    private DevilFruitTypeDto type;
    private ImageDto image;

    public DevilFruitDto(final DevilFruit df) {
        if (Objects.nonNull(df.getType())) {
            this.type = new ModelMapper().map(df.getType(), DevilFruitTypeDto.class);
        }
        if (Objects.nonNull(df.getImage())) {
            this.image = new ModelMapper().map(df.getImage(), ImageDto.class);
        }

        this.name = df.getName();
        this.meaning = df.getMeaning();
        this.history = df.getHistory();
    }
}
