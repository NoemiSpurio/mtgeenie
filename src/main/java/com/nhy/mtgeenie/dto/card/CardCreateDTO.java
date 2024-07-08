package com.nhy.mtgeenie.dto.card;

import com.nhy.mtgeenie.dto.cost.CostCreateDTO;
import com.nhy.mtgeenie.enumeration.CardRarityEnum;
import com.nhy.mtgeenie.enumeration.CardTypeEnum;
import com.nhy.mtgeenie.model.Card;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardCreateDTO {
    @NonNull
    private String name;

    @NonNull
    private String number;

    @NonNull
    private String setId;

    private List<CardTypeEnum> types;

    @NonNull
    private CostCreateDTO cost;

    @NonNull
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
