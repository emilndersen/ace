package com.ace.backend.dto.review;

import lombok.Data;

@Data
public class ReviewDto {
    private Long id;
    private String authorName;
    private String text;
    private int rating;
    private String createdAt;   // красиво отформатированная дата для UI
}
