package br.com.design.pattern.chainofresponsibility.imposto;

import br.com.design.pattern.chainofresponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
