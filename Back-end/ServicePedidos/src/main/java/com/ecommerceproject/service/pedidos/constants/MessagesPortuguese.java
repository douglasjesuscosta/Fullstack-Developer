package com.ecommerceproject.service.pedidos.constants;

/**
 * Messages
 */
public final class MessagesPortuguese {
    
    private MessagesPortuguese() {

    }

    /* User validation messages */
    public static final String  MESSAGE_CLIENTE_REQUIRED = "O preenchimento do cliente é obrigatório.";
    public static final String  MESSAGE_PRODUCT_REQUIRED = "Necessário selecionar ao menor um produto";
    
    /* Error messages para exivição ao usuário */
    public static final String  GENERAL_SYSTEM_ERROR = "Ocorreu algum erro interno no servido durante a requisição. Tente novamente mais tarde;";
    public static final String  CODE_SYSTEM_ERROR = "Ocorreu algum erro interno no servido durante a requisição. Entre em contato com a equipe de manutenção para resolução do problema.";
    
    public static final String CLIENTID_REQUIRED="Necessário informar o id do cliente";
    public static final String PRODUTOS_REQUIRED="Necessário informar ao menos um produto";
    public static final String TOTAL_PRECO_REQUIRED="Necessário informar o preço total";
    public static final String TOTAL_ITENS_REQUIRED="Necessário informar o total de itens";
    public static final String TOTAL_PRECO_FRETE_REQUIRED="Necessário informar o valor do frete";

}