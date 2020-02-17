import { Observable } from "rxjs";
import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";


/**
 * Classe de integração com o serviço de Pedido.
 */
@Injectable({
    providedIn: 'root'
})
export class ClienteProdutoClientService {

    private linkEndpoint: String = "https://api.myjson.com/bins/tnjfr";
       

    /**
     * Construtor da classe.
     * 
     * @param http 
     */
    constructor(private http: HttpClient) { }

    /**
     * Retorna o array de pedidos e clientes.
     *  
     */
    public getTodosPedidosClientens(): Observable<any> {
        return this.http.get(`${this.linkEndpoint}`);
    }
}
