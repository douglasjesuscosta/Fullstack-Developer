import { Observable } from "rxjs";
import { Injectable } from "@angular/core";
import { Resolve, ActivatedRouteSnapshot, Router } from "@angular/router";

import { PedidoClientService } from './pedido-client.service';

/**
 * Classe resolve responsável pela busca das informações de pedidos
 * para carregamento da listagem de pedidos.
 *
 */
@Injectable()
export class PedidosResolve implements Resolve<any> {

  /**
   * Construtor da classe.
   * 
   * @param router 
   * @param  
   * @param messageService 
   */
  constructor(
    private router: Router,
    private pedidosClientService: PedidoClientService
  ) { }

  /**
   * Realiza a consulta de pedidos.
   * 
   * @param route
   */
  resolve(route: ActivatedRouteSnapshot): Observable<any> {
    let id = route.params["id"];

    return new Observable(observer => {
      this.pedidosClientService.getTodosPedidos().subscribe(
        data => {
          observer.next(data);
          observer.complete();
        },
        error => {
          observer.error(error);
          this.router.navigate([""]);
        }
      );
    });
  }
}
