package com.nhy.mtgeenie.service;

import com.nhy.mtgeenie.dto.card.CardCreateDTO;
import com.nhy.mtgeenie.exception.MtgeenieException;
import com.nhy.mtgeenie.model.Card;
import com.nhy.mtgeenie.model.CardType;
import com.nhy.mtgeenie.model.Set;
import com.nhy.mtgeenie.repository.CardRepository;
import com.nhy.mtgeenie.repository.CardTypeRepository;
import com.nhy.mtgeenie.repository.SetRepository;
import com.nhy.mtgeenie.repository.TypeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@CommonsLog
public class CardService {

    private final CardRepository cardRepository;
    private final SetRepository setRepository;
    private final TypeRepository typeRepository;
    private final CardTypeRepository cardTypeRepository;

    @Transactional
    public void create(CardCreateDTO dto) {
        log.info("INIZIO metodo creazione card");
        //Recupero il set al quale appartiene la carta
        Set set = setRepository.findById(dto.getSetId())
                .orElseThrow(() -> new MtgeenieException("set.id-not-found", HttpStatus.BAD_REQUEST));

        Optional<Card> cardAlreadySaved = cardRepository.findByNameAndSet(dto.getName(), set);

        if (cardAlreadySaved.isPresent()) {
            changeAmount(cardAlreadySaved.get(), dto.getAmountOwned());
            log.info("FINE metodo creazione card, per card con id: " + cardAlreadySaved.get().getId());
        } else {
            Card card = dto.toModel();
            card.setSet(set);
            Card cardSaved = cardRepository.save(card);

            List<CardType> cardTypes = new ArrayList<>();
            dto.getTypes().forEach(type -> cardTypes.add(CardType.builder()
                    .card(cardSaved)
                    .type(typeRepository.findByName(type)
                            .orElseThrow(() -> new MtgeenieException("type.name-not-found", HttpStatus.BAD_REQUEST)))
                    .build()));
            cardTypeRepository.saveAll(cardTypes);
            log.info("FINE metodo creazione card, per card con id: " + cardSaved.getId());
        }
    }

    public void changeAmount(Card card, int amount){
        log.info("INIZIO metodo modifica quantita' carte, per carta con id: " + card.getId());
        int newAmount = card.getAmountOwned() + amount;

        if (newAmount < 0) {
            throw new MtgeenieException("card.negative-amount", HttpStatus.BAD_REQUEST);
        } else if (newAmount == 0) {
            cardRepository.delete(card);
        } else {
            card.setAmountOwned(card.getAmountOwned() + amount);
            cardRepository.save(card);
        }
        log.info("FINE metodo modifica quantita' carta, per carta con id: " + card.getId());
    }
}
