package com.codex.aposta.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codex.aposta.Repository.ApostadorRepository;
import com.codex.aposta.controller.In.ApostadorIn;
import com.codex.aposta.model.Apostador;

@RestController
public class ApostadorController {

    private final ApostadorRepository apostadorRepository;

    public ApostadorController(ApostadorRepository apostadorRepository) {
        this.apostadorRepository = apostadorRepository;
    }

    @PostMapping("/apostador")
    public ResponseEntity salvarApostador(@RequestBody ApostadorIn apostadorIn) {

        Apostador apostador = apostadorIn.toConvert();
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
