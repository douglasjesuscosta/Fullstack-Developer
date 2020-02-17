import { Routes } from '@angular/router';

import { PedidosResolve } from './pedidos.resolve';
import { PedidoComponent } from './pedido/pedido.component';
import { ClienteProdutoResolve } from '../shared/clienteproduto.resolve';
import { ListpedidosComponent } from './listpedidos/listpedidos.component';

/**
 * Configuração de rotas de Pedido.
 */
export const PedidosRoutes: Routes = [
  {
    path: 'novo',
    component: PedidoComponent,
    resolve: {
      pedidosClientens: ClienteProdutoResolve
    }
  },
  {
    path: '',
    component: ListpedidosComponent,
    resolve: {
      pedidos: PedidosResolve
    }
  }
];
