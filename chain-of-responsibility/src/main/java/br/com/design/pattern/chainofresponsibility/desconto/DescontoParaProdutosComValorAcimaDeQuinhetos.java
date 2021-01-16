package br.com.design.pattern.chainofresponsibility.desconto;

import br.com.design.pattern.chainofresponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaProdutosComValorAcimaDeQuinhetos extends Desconto{

    public DescontoParaProdutosComValorAcimaDeQuinhetos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return proximo.calcular(orcamento);
    }
}
