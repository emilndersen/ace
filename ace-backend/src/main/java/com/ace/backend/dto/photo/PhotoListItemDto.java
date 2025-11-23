package com.ace.backend.dto.photo;

import lombok.Data;

@Data
public class PhotoListItemDto {
    private Long id;
    private String imageUrl;
    private String title;
}
