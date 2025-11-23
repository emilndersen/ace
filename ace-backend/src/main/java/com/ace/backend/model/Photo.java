package com.ace.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "photos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Photo extends BaseEntity {

    @Column(nullable = false)
    private String title;          // Заголовок/название фото (может не отображаться, но пригодится для админки)

    @Column(nullable = false)
    private String imageUrl;       // Путь к изображению (S3, local, CDN, uploads/...)

    @Column(nullable = false)
    private String thumbnailUrl;   // Маленькая версия (быстрее для галерей)

    @Column(columnDefinition = "TEXT")
    private String description;    // Описание/инфо (опционально)

    @Column(nullable = false)
    private Integer displayOrder;  // Порядок отображения в галерее

    @Column(nullable = false)
    private Boolean published;     // true = видно посетителям, false = скрыто

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private PhotographerProfile profile; // владеющая сторона связи
}

