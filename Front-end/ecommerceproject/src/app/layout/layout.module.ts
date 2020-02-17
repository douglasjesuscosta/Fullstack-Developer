import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { CollapseModule } from 'ngx-bootstrap/collapse';

import { NavbarComponent } from './navbar/navbar.component';

/**
 * Módulo que agrupa os componentes referentes a layout como
 * navbar, componentes de mensagens e outros componentes de 
 * uso geral no sistema.
 * 
 */
@NgModule({
  declarations: [NavbarComponent],
  imports: [
    CommonModule,
    BrowserAnimationsModule,
    CollapseModule.forRoot()
  ],
  providers: [
    NavbarComponent
  ],
  exports: [
    NavbarComponent
  ]
})
export class LayoutModule { }
