package com.nhy.mtgeenie.controller;

import com.nhy.mtgeenie.dto.card.CardCreateDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/card")
public class CardController {

    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody CardCreateDTO dto) {
        return ResponseEntity.ok(null);
    }
}
