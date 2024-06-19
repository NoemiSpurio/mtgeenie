package com.nhy.mtgeenie.model;

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

    @ManyToOne
    @JoinColumn(name = "set_id")
    private Set set;

    @OneToOne
    @JoinColumn(name = "cost_id")
    private Cost cost;
}
