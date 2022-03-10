package com.examples.ivmdiaz.dto.master;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TagDto extends KeyValueDto {
    private String summary;
}
