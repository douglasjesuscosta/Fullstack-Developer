import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomepageComponent } from './homepage/homepage.component';


/**
 * Rotas referentes aos componentes de páginas.
 */
const routes: Routes = [
  {
    path: '', component: HomepageComponent
  },
  {
    path: 'pedidos',
    loadChildren: () => import('./pedidosmodule/pedidos.module').then(module => module.PedidosModule)
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PagesRoutingModule { }
