package com.nhy.mtgeenie.model;

import com.nhy.mtgeenie.enumeration.CardRarityEnum;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private String number;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "rarity")
    private CardRarityEnum rarity;

    @ManyToOne
    @JoinColumn(name = "set_id")
    private Set set;

    @OneToOne
    @JoinColumn(name = "cost_id")
    private Cost cost;
}
