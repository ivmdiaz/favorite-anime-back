package com.examples.ivmdiaz.dto.master;

import lombok.Data;

@Data
public class ImageDto {
    private KeyValueDto category;
    private String code;
    private String filename;
    private String url;
    private String summary;
}
