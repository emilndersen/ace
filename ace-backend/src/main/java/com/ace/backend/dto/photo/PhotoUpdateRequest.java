package com.ace.backend.dto.photo;

import lombok.Data;

@Data
public class PhotoUpdateRequest {
    private String title;
    private String description;
    private Boolean publicVisible; // можно менять видимость
    private Integer sortOrder;
}
