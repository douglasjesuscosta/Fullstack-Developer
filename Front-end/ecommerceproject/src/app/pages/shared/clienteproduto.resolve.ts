import { Observable } from "rxjs";
import { Injectable } from "@angular/core";
import { Resolve, ActivatedRouteSnapshot, Router } from "@angular/router";

import { ClienteProdutoClientService } from './clienteprodutoclient.service';

/**
 * Classe resolve responsável pela busca das informações de cliente e produtos
 * para carregamento do cadastro de Pedido.
 *
 */
@Injectable()
export class ClienteProdutoResolve implements Resolve<any> {

  /**
   * Construtor da classe.
   * 
   * @param router 
   * @param  
   * @param messageService 
   */
  constructor(
    private router: Router,
    private clientProdutoClientService: ClienteProdutoClientService
  ) { }

  /**
   * Realiza a consulta de produt por id.
   * 
   * @param route
   */
  resolve(route: ActivatedRouteSnapshot): Observable<any> {
    let id = route.params["id"];

    return new Observable(observer => {
      this.clientProdutoClientService.getTodosPedidosClientens().subscribe(
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
