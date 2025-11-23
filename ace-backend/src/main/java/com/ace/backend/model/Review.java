package com.ace.backend.model;

import com.ace.backend.model.enums.ReviewStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "reviews")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Review extends BaseEntity {
    
    @Column(nullable = false)
    private String authorName;      // Имя человека, который оставил отзыв

    @Column(nullable = false, columnDefinition = "TEXT")
    private String text;            // Текст отзыва

    @Builder.Default
    @Column(nullable = false)
    private Boolean published = false; // Показывается на сайте или нет

    @Column
    private Integer rating;         // Оценка (1–5), опционально

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private ReviewStatus status = ReviewStatus.PENDING;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private PhotographerProfile profile; // владеющая сторона связи
}
