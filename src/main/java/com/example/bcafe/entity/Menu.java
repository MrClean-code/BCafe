package com.example.bcafe.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "menu", schema="cafe")
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "mainChicken")
    private String mainChicken;

    @Column(name = "mainBurrito")
    private String mainBurrito;

    @Column(name = "mainPotato")
    private String mainPotato;

    @Column(name = "saladGreek")
    private String saladGreek;

    @Column(name = "saladOranges")
    private String saladOranges;

    @Column(name = "saladShrimp")
    private String saladShrimp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cart_id")
    private Cart cart;

}

