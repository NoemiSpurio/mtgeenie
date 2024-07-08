package com.nhy.mtgeenie.dto.cost;

import com.nhy.mtgeenie.model.Cost;
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

    public Cost toModel(){
        return Cost.builder()
                .black(this.black)
                .blue(this.blue)
                .white(this.white)
                .red(this.red)
                .green(this.green)
                .generic(this.generic)
                .colorless(this.colorless)
                .snow(this.snow)
                .uw(this.uw)
                .ub(this.ub)
                .br(this.br)
                .rg(this.rg)
                .wg(this.wg)
                .bw(this.bw)
                .ur(this.ur)
                .bg(this.bg)
                .colorlessW(this.colorlessW)
                .colorlessU(this.colorlessU)
                .colorlessB(this.colorlessB)
                .colorlessR(this.colorlessR)
                .colorlessG(this.colorlessG)
                .doubleGenericW(this.doubleGenericW)
                .doubleGenericU(this.doubleGenericU)
                .doubleGenericB(this.doubleGenericB)
                .doubleGenericR(this.doubleGenericR)
                .doubleGenericG(this.doubleGenericG)
                .phyrexianW(this.phyrexianW)
                .phyrexianU(this.phyrexianU)
                .phyrexianB(this.phyrexianB)
                .phyrexianR(this.phyrexianR)
                .phyrexianG(this.phyrexianG)
                .phyrexianRG(this.phyrexianRG)
                .phyrexianGW(this.phyrexianGW)
                .phyrexianRW(this.phyrexianRW)
                .phyrexianUG(this.phyrexianUG)
                .build();
    }
}
