package com.nhy.mtgeenie.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Cost {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "black")
    private Integer black;

    @Column(name = "blue")
    private Integer blue;

    @Column(name = "white")
    private Integer white;

    @Column(name = "red")
    private Integer red;

    @Column(name = "green")
    private Integer green;

    @Column(name = "generic")
    private Integer generic;

    @Column(name = "colorless")
    private Integer colorless;

    @Column(name = "snow")
    private Integer snow;

    @Column(name = "uw")
    private Integer uw;

    @Column(name = "ub")
    private Integer ub;

    @Column(name = "br")
    private Integer br;

    @Column(name = "rg")
    private Integer rg;

    @Column(name = "wg")
    private Integer wg;

    @Column(name = "bw")
    private Integer bw;

    @Column(name = "ur")
    private Integer ur;

    @Column(name = "bg")
    private Integer bg;

    @Column(name = "colorless_w")
    private Integer colorlessW;

    @Column(name = "colorless_u")
    private Integer colorlessU;

    @Column(name = "colorless_b")
    private Integer colorlessB;

    @Column(name = "colorless_r")
    private Integer colorlessR;

    @Column(name = "colorless_g")
    private Integer colorlessG;

    @Column(name = "double_generic_w")
    private Integer doubleGenericW;

    @Column(name = "double_generic_u")
    private Integer doubleGenericU;

    @Column(name = "double_generic_b")
    private Integer doubleGenericB;

    @Column(name = "double_generic_r")
    private Integer doubleGenericR;

    @Column(name = "double_generic_g")
    private Integer doubleGenericG;

    @Column(name = "phyrexian_w")
    private Integer phyrexianW;

    @Column(name = "phyrexian_u")
    private Integer phyrexianU;

    @Column(name = "phyrexian_b")
    private Integer phyrexianB;

    @Column(name = "phyrexian_r")
    private Integer phyrexianR;

    @Column(name = "phyrexian_g")
    private Integer phyrexianG;

    @Column(name = "phyrexian_r_g")
    private Integer phyrexianRG;

    @Column(name = "phyrexian_g_w")
    private Integer phyrexianGW;

    @Column(name = "phyrexian_r_w")
    private Integer phyrexianRW;

    @Column(name = "phyrexian_u_g")
    private Integer phyrexianUG;
}
