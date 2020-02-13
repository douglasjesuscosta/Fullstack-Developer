package com.ecommerceproject.service.pedidos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

import com.ecommerceproject.service.pedidos.dto.PedidoDTO;
import com.ecommerceproject.service.pedidos.dto.ProdutoDTO;
import com.ecommerceproject.service.pedidos.service.PedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;


/**
 * PedidoController
 */
@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> getPedidos() {
        return null;
    }

    @GetMapping(path = "/{idPedido}",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ProdutoDTO> getPedido(@PathVariable String idProduto) {
        return null;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProdutoDTO> createPedido(@Valid @RequestBody PedidoDTO pedidoDTO) {
        pedidoDTO = pedidoService.createPedido(pedidoDTO);

        return null;
    }

    @DeleteMapping(path = "/{idPedido}")
    public ResponseEntity<Integer> deletePedido() {
        return null;
    }
    
}