package com.ecommerceproject.service.frete.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

/**
 * FreteService
 * 
 * Serviço que concentra as operaçoes e regras de negócio
 * relacionadas ao frete.
 */
@Service
public class FreteService {

    /**
     * Método que calcula o valor do frete a partir da quantidade
     * de itens.
     * 
     * @param quatidadeItensSelecionados
     * @return
     */
    public Double calcularValorFrete(int quatidadeItensSelecionados) {
        final int minValue = 5;
        final int maxValue = 10;

        int randomValue = ThreadLocalRandom.current().nextInt(minValue, maxValue + 1);
        return (double) (quatidadeItensSelecionados * randomValue);
    }

}