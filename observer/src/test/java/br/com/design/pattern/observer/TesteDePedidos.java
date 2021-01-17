package br.com.design.pattern.observer;

import br.com.design.pattern.observer.orcamento.Orcamento;
import br.com.design.pattern.observer.orcamento.pedido.GeraPedido;
import br.com.design.pattern.observer.orcamento.pedido.GeraPedidoHandler;
import br.com.design.pattern.observer.orcamento.pedido.Pedido;
import br.com.design.pattern.observer.orcamento.pedido.acao.EnviarEmailPedido;
import br.com.design.pattern.observer.orcamento.pedido.acao.SalvarPedidoNoBancoDeDados;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootTest
class TesteDePedidos {

    @Test
    public void deve_criar_um_pedido_com_base_no_orcamento() {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
        String cliente = "Daniel Silva";
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(cliente, data, orcamento);

        GeraPedido gerador = new GeraPedido(cliente, orcamento.getValor(), orcamento.getQuantidadeDeItens());
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido())
        );
        handler.execute(gerador);
    }

}
