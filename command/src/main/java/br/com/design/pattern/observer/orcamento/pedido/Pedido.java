package br.com.design.pattern.command.orcamento.pedido;

import br.com.design.pattern.command.orcamento.Orcamento;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Pedido {
    private String cliente;
    private LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }
}
