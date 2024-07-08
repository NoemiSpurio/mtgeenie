package com.nhy.mtgeenie.controller;

import com.nhy.mtgeenie.dto.card.CardCreateDTO;
import com.nhy.mtgeenie.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/card")
@AllArgsConstructor
public class CardController {

    private final CardService cardService;

    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody CardCreateDTO dto) {
        cardService.create(dto);
        return ResponseEntity.ok(null);
    }
}
