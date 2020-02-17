package com.ecommerceproject.service.frete.controller;

import com.ecommerceproject.service.frete.service.FreteService;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * FreteController
 * 
 * Classe referente aos métodos que dão início aos fluxos de operações
 * relacionadas a frete.
 */
@RestController
@RequestMapping("frete")
public class FreteController {

    @Autowired
    private FreteService freteService;


    /**
     * Método que da início ao fluxo de cálculo 
     * do frete a partir da quantidade de produtos
     * informada.
     * 
     * @param quantidadeItensSelecionados
     */
    @GetMapping(path = "/{quatidadeItensSelecionados}",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Double> getValorFrete(@PathVariable int quatidadeItensSelecionados) {

        Double result = freteService.calcularValorFrete(quatidadeItensSelecionados);
        return new ResponseEntity<Double>(result, HttpStatus.OK);
    }
    
}