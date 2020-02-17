import { Produto } from './produto';

/**
 * Classe que representa o modelo de Pedido.
 */
export class Pedido {
    private idPedido: Number;
    private clientId: Number;
    private totalItens: Number; 
    private totalPrecoFrete: Number; 
    private totaPrecoPedido: Number; 
    private totalPrecoSemFrete: Number;
    private produtos: Produto[];


    /**
     * Getter $idPedido
     * @return {Number}
     */
	public get $idPedido(): Number {
		return this.idPedido;
	}

    /**
     * Getter $clientId
     * @return {Number}
     */
	public get $clientId(): Number {
		return this.clientId;
	}

    /**
     * Getter $totalItens
     * @return {Number}
     */
	public get $totalItens(): Number {
		return this.totalItens;
	}

    /**
     * Getter $totalPrecoFrete
     * @return {Number}
     */
	public get $totalPrecoFrete(): Number {
		return this.totalPrecoFrete;
	}

    /**
     * Getter $totaPrecoPedido
     * @return {Number}
     */
	public get $totaPrecoPedido(): Number {
		return this.totaPrecoPedido;
	}

    /**
     * Getter $produtos
     * @return {Produto[]}
     */
	public get $produtos(): Produto[] {
		return this.produtos;
	}

    /**
     * Setter $idPedido
     * @param {Number} value
     */
	public set $idPedido(value: Number) {
		this.idPedido = value;
	}

    /**
     * Setter $clientId
     * @param {Number} value
     */
	public set $clientId(value: Number) {
		this.clientId = value;
	}

    /**
     * Setter $totalItens
     * @param {Number} value
     */
	public set $totalItens(value: Number) {
		this.totalItens = value;
	}

    /**
     * Setter $totalPrecoFrete
     * @param {Number} value
     */
	public set $totalPrecoFrete(value: Number) {
		this.totalPrecoFrete = value;
	}

    /**
     * Setter $totaPrecoPedido
     * @param {Number} value
     */
	public set $totaPrecoPedido(value: Number) {
		this.totaPrecoPedido = value;
	}

    /**
     * Setter $produtos
     * @param {Produto[]} value
     */
	public set $produtos(value: Produto[]) {
		this.produtos = value;
	}

    /**
     * Getter $totalPrecoSemFrete
     * @return {Number}
     */
	public get $totalPrecoSemFrete(): Number {
		return this.totalPrecoSemFrete;
	}

    /**
     * Setter $totalPrecoSemFrete
     * @param {Number} value
     */
	public set $totalPrecoSemFrete(value: Number) {
		this.totalPrecoSemFrete = value;
	}

}