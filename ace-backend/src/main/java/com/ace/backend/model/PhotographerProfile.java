package com.ace.backend.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "photographer_profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhotographerProfile extends BaseEntity {

    @Column(nullable = false)
    private String name; // Имя фотографа / бренд

    @Column(length = 1000)
    private String bio; // Описание / о себе

    @Column
    private String avatarUrl; // Фото профиля

    @Column
    private String location; // Город / страна

    @Column
    private String phone; // Номер телефона

    @Column
    private String email; // Почта

    @Column
    private String instagram; // Соцсети

    @Column
    private String website; // Личный сайт

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<Photo> photos = new ArrayList<>(); // Галерея фотографий

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<Review> reviews = new ArrayList<>(); // Отзывы клиентов
}
