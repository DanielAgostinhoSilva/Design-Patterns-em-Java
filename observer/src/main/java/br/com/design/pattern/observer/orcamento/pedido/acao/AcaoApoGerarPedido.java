package br.com.design.pattern.observer.orcamento.pedido.acao;

import br.com.design.pattern.observer.orcamento.pedido.Pedido;

public interface AcaoApoGerarPedido {
    void executarAcao(Pedido pedido);
}
