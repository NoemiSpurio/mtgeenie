package com.nhy.mtgeenie.model;

import com.nhy.mtgeenie.enumeration.CardTypeEnum;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "name")
    private CardTypeEnum name;
}
