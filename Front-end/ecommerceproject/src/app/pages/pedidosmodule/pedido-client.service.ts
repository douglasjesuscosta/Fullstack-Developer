import { Observable } from "rxjs";
import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { environment } from 'src/environments/environment';
import { Pedido } from 'src/model/pedido';


/**
 * Classe de integração com o serviço de Pedido.
 */
@Injectable({
    providedIn: 'root'
})
export class PedidoClientService {

    private serviceName: String = "pedidos-ws";
    private endpointName: String = "pedido";

    /**
     * Construtor da classe.
     * 
     * @param http 
     */
    constructor(private http: HttpClient) { }

    /**
     * Salva a instância de pedido.
     * 
     * @param pedido
     * @return
     */
    public salvar(pedido: Pedido): Observable<any> {
        let result: Observable<any> = null;
        console.log(JSON.stringify(pedido));
        result = this.http.post(`${environment.urlGatewayService}/${this.serviceName}/${this.endpointName}`, pedido);

        return result;
    }

    /**
     * Retorna o array de pedidos.
     * 
     * @param filtroDTO 
     */
    public getTodosPedidos(): Observable<any> {
        return this.http.get(`${environment.urlGatewayService}/${this.serviceName}/${this.endpointName}`);
    }
}
