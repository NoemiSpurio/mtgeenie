package com.nhy.mtgeenie.service;

import com.nhy.mtgeenie.dto.card.CardCreateDTO;
import com.nhy.mtgeenie.exception.MtgeenieException;
import com.nhy.mtgeenie.model.Set;
import com.nhy.mtgeenie.repository.CardRepository;
import com.nhy.mtgeenie.repository.SetRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CardService {

    private final CardRepository cardRepository;
    private final SetRepository setRepository;

    void create(CardCreateDTO dto) {
        //Recupero il set al quale appartiene la carta
        Set set = setRepository.findById(dto.getSetId())
                .orElseThrow(() -> new MtgeenieException("Errore: set_id non valido", HttpStatus.BAD_REQUEST));

        //TODO finire logica
    }
}
