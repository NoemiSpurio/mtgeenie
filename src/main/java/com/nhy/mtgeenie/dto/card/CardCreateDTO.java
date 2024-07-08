package com.nhy.mtgeenie.dto.card;

import com.nhy.mtgeenie.dto.cost.CostCreateDTO;
import com.nhy.mtgeenie.enumeration.CardRarityEnum;
import com.nhy.mtgeenie.enumeration.CardTypeEnum;
import com.nhy.mtgeenie.model.Card;
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
    private CardRarityEnum rarity;
    private int amountOwned;

    public Card toModel(){
        return Card.builder()
                .name(this.name)
                .number(this.number)
                .cost(cost.toModel())
                .rarity(this.rarity)
                .amountOwned(this.amountOwned)
                .build();
    }
}
