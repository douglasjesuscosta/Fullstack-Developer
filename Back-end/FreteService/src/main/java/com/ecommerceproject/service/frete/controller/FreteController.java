package com.ecommerceproject.service.frete.controller;

import com.ecommerceproject.service.frete.service.FreteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FreteController
 */
@RestController
@RequestMapping("frete")
public class FreteController {

    @Autowired
    private FreteService freteService;

    @GetMapping(path = "/{quatidadeItensSelecionados}",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Integer> getValorFrete(@PathVariable int quatidadeItensSelecionados) {

        Integer result = freteService.calcularValorFrete(quatidadeItensSelecionados);
        return new ResponseEntity<Integer>(result, HttpStatus.OK);
    }
    
}