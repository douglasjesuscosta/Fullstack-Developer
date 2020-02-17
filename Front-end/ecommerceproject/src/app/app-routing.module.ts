import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

/**
 * Rotas para os módulos da aplicação.
 */
const routes: Routes = [
  {
    path: '',
    loadChildren: () => import('./pages/pages.module').then(module => module.PagesModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
