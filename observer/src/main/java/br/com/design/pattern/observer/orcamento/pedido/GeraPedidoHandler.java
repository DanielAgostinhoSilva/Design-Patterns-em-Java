package br.com.design.pattern.observer.orcamento.pedido;

import br.com.design.pattern.observer.orcamento.Orcamento;
import br.com.design.pattern.observer.orcamento.pedido.acao.AcaoApoGerarPedido;
import br.com.design.pattern.observer.orcamento.pedido.acao.EnviarEmailPedido;
import br.com.design.pattern.observer.orcamento.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoApoGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoApoGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        acoes.forEach( a -> a.executarAcao(pedido));
    }
}
