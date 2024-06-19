package com.nhy.mtgeenie.dto.card;

import com.nhy.mtgeenie.dto.cost.CostCreateDTO;
import com.nhy.mtgeenie.enumeration.CardTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardCreateDTO {
    private String name;
    private String number;
    private String setId;
    private List<CardTypeEnum> types;
    private CostCreateDTO cost;
}
