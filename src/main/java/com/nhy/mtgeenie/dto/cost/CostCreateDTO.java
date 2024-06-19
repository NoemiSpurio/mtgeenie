package com.nhy.mtgeenie.dto.cost;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CostCreateDTO {
    private Integer black;
    private Integer blue;
    private Integer white;
    private Integer red;
    private Integer green;
    private Integer generic;
    private Integer colorless;
    private Integer snow;
    private Integer uw;
    private Integer ub;
    private Integer br;
    private Integer rg;
    private Integer wg;
    private Integer bw;
    private Integer ur;
    private Integer bg;
    private Integer colorlessW;
    private Integer colorlessU;
    private Integer colorlessB;
    private Integer colorlessR;
    private Integer colorlessG;
    private Integer doubleGenericW;
    private Integer doubleGenericU;
    private Integer doubleGenericB;
    private Integer doubleGenericR;
    private Integer doubleGenericG;
    private Integer phyrexianW;
    private Integer phyrexianU;
    private Integer phyrexianB;
    private Integer phyrexianR;
    private Integer phyrexianG;
    private Integer phyrexianRG;
    private Integer phyrexianGW;
    private Integer phyrexianRW;
    private Integer phyrexianUG;
}
