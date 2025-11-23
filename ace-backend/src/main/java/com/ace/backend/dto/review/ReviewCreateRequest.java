package com.ace.backend.dto.review;

import lombok.Data;

@Data
public class ReviewCreateRequest {
    private String authorName;
    private String text;
    private int rating; // 1–5
}