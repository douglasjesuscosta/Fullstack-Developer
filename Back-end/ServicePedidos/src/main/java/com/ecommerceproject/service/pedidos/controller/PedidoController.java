package com.ecommerceproject.service.pedidos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

import com.ecommerceproject.service.pedidos.dto.PedidoDTO;
import com.ecommerceproject.service.pedidos.dto.ProdutoDTO;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * PedidoController
 */
@RestController
@RequestMapping("pedido")
public class PedidoController {

    @GetMapping
    public List<ProdutoDTO> getPedidos(@RequestParam String param) {
        return null;
    }

    @GetMapping(path = "/{idPedido}",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public ProdutoDTO getPedido(@PathVariable String idProduto) {
        return null;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ProdutoDTO createPedido(@Valid @RequestBody PedidoDTO pedidoDTO) {
        
        return null;
    }

    @DeleteMapping(path = "/{idPedido}")
    public void deletePedido() {

    }
    
}