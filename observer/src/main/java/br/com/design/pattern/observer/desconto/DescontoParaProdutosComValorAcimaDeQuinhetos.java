package br.com.design.pattern.observer.desconto;

import br.com.design.pattern.observer.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaProdutosComValorAcimaDeQuinhetos extends Desconto {

    public DescontoParaProdutosComValorAcimaDeQuinhetos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean delveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
