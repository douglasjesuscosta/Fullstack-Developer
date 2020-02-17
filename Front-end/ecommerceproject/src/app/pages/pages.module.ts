import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PagesRoutingModule } from './pages.routing.module';
import { HomepageComponent } from './homepage/homepage.component';
import { ClienteProdutoResolve } from './shared/clienteproduto.resolve';

/**
 * Módulo referentes as páginas do sistema, que serão apresentadas no
 * container principal do sistema.
 */

@NgModule({
  declarations: [
    HomepageComponent
  ],
  imports: [
    CommonModule,
    PagesRoutingModule
  ],
  providers:[
    ClienteProdutoResolve
  ]
})
export class PagesModule { }
