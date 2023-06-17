package com.template.demo.domain.type

enum class RefusalReasonType(val code: String) {
    PRODUTO_DESATIVADO("R001"),
    TERMINO_ESTOQUE("R002"),
    ITEM_INDISPONIVEL_PEDIDOS("R003"),
    PEDIDO_FORA_DATA_LIMITE("R004"),
    CANCELAMENTO_SEMANAL("R005"),
    ATRIBUIDO_INTERNAMENTE_ERP("R006"),
    PEDIDO_PENTENTE_MAIOR_30_DIAS("R007"),
    ITEM_FORNECIDO_PARCIALMENTE("R008"),
    ITEM_ACIMA_QTDE_LIMITE("R009"),
    PEDIDO_TRANSF_DISTRIBUIDOR("R010"),
    CANCELADO_INDUSTRIA("R000"),
    CANCELADO_SEM_ESTOQUE("01")
}