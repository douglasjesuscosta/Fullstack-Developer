import { Observable } from "rxjs";
import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";

import { environment } from 'src/environments/environment';


/**
 * Classe de integração com o serviço de Frete.
 */
@Injectable({
    providedIn: 'root'
})
export class ClientFreteService {
       

    /**
     * Construtor da classe.
     * 
     * @param http 
     */
    constructor(private http: HttpClient) { }

    /**
     * Retorna o preço do frete a partir do valor informado.
     *  
     */
    public getValorFrete(quantidadeItens: Number): Observable<any> {
        return this.http.get(`${environment.urlGatewayService}/${environment.freteService}/frete/${quantidadeItens}`);
    }
}
