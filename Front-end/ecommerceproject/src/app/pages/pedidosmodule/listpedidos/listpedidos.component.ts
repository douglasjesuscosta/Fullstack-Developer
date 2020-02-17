import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-listpedidos',
  templateUrl: './listpedidos.component.html',
  styleUrls: ['./listpedidos.component.css']
})
/**
 * Componente referente a listagem de produtos
 */
export class ListpedidosComponent implements OnInit {

  public pedidosClientes = [];

  constructor(route: ActivatedRoute) { 
    this.pedidosClientes = route.snapshot.data["pedidos"];
  }

  ngOnInit() {
  }

}
