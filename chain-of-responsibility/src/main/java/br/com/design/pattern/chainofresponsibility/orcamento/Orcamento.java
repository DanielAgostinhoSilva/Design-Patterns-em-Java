package br.com.design.pattern.chainofresponsibility.orcamento;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Orcamento {
    private BigDecimal valor;
    private int quantidadeDeItens;
}
