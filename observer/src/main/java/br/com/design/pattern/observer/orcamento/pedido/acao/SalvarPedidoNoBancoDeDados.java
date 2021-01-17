package br.com.design.pattern.observer.orcamento.pedido.acao;

import br.com.design.pattern.observer.orcamento.pedido.Pedido;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class SalvarPedidoNoBancoDeDados implements AcaoApoGerarPedido{

    public void executarAcao(Pedido pedido) {
       log.info("Salvando pedido no banco de Dados!");
    }
}
