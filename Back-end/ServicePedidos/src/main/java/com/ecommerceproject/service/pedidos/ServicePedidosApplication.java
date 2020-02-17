package com.ecommerceproject.service.pedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ServicePedidosApplication
 * 
 * Serviço para operações com {@link Pedido}. 
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServicePedidosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicePedidosApplication.class, args);
	}

}
