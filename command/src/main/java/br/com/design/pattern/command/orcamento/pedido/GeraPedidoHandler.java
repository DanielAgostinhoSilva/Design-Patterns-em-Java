package br.com.design.pattern.command.orcamento.pedido;

import br.com.design.pattern.command.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
    }
}
