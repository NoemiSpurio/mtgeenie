package com.nhy.mtgeenie.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "mtg_set")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Set {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "type")
    private String type;

    @Column(name = "notes")
    private String notes;

    @Column(name = "release_date")
    private LocalDate releaseDate;
}
