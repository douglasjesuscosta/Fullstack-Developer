package com.ecommerceproject.service.frete.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

/**
 * FreteService
 */
@Service
public class FreteService {

    public int calcularValorFrete(int quatidadeItensSelecionados) {
        final int minValue = 5;
        final int maxValue = 10;

        int randomValue = ThreadLocalRandom.current().nextInt(minValue, maxValue + 1);
        return quatidadeItensSelecionados * randomValue;
    }

}