import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { NgSelectModule } from '@ng-select/ng-select';

import { PedidosRoutes } from './pedidos.router';
import { PedidoComponent } from './pedido/pedido.component';
import { ClienteProdutoResolve } from '../shared/clienteproduto.resolve';
import { ListpedidosComponent } from './listpedidos/listpedidos.component';
import { PedidosResolve } from './pedidos.resolve';

@NgModule({
  declarations: [
    PedidoComponent,
    ListpedidosComponent
  ],
  imports: [
    FormsModule,
    CommonModule,
    NgSelectModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forChild(PedidosRoutes)
  ],
  providers: [
    PedidosResolve
  ]
})
export class PedidosModule { }
