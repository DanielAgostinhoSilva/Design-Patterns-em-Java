package br.com.design.pattern.observer.orcamento.pedido;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;

@Log4j2
@Getter
public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }
}
