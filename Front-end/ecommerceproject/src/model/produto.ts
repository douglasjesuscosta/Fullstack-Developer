/**
 * Classe que representa o modelo de produto
 */
export class Produto {
    private id: Number;
    private codigo: String;
    private nome: String;
    private precoUnitario: Number;
    private quantidade: Number;


    /**
     * Getter $id
     * @return {Number}
     */
	public get $id(): Number {
		return this.id;
	}

    /**
     * Getter $codigo
     * @return {String}
     */
	public get $codigo(): String {
		return this.codigo;
	}

    /**
     * Getter $nome
     * @return {String}
     */
	public get $nome(): String {
		return this.nome;
	}

    /**
     * Getter $precoUnitario
     * @return {Number}
     */
	public get $precoUnitario(): Number {
		return this.precoUnitario;
	}

    /**
     * Getter $quantidade
     * @return {Number}
     */
	public get $quantidade(): Number {
		return this.quantidade;
	}

    /**
     * Setter $id
     * @param {Number} value
     */
	public set $id(value: Number) {
		this.id = value;
	}

    /**
     * Setter $codigo
     * @param {String} value
     */
	public set $codigo(value: String) {
		this.codigo = value;
	}

    /**
     * Setter $nome
     * @param {String} value
     */
	public set $nome(value: String) {
		this.nome = value;
	}

    /**
     * Setter $precoUnitario
     * @param {Number} value
     */
	public set $precoUnitario(value: Number) {
		this.precoUnitario = value;
	}

    /**
     * Setter $quantidade
     * @param {Number} value
     */
	public set $quantidade(value: Number) {
		this.quantidade = value;
	}
}