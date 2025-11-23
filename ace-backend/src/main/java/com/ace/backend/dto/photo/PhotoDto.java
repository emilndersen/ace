package com.ace.backend.dto.photo;

import lombok.Data;

@Data
public class PhotoDto {
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private boolean publicVisible;
    private Integer sortOrder;
}
