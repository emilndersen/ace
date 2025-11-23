package com.ace.backend.dto.photo;

import lombok.Data;

@Data
public class PhotoCreateRequest {
    private String title;
    private String description;
    private String imageUrl;   // ссылка на картинку
    private Integer sortOrder; // порядок в галерее (опционально)
}

