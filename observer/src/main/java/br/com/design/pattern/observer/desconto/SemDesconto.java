package br.com.design.pattern.observer.desconto;

import br.com.design.pattern.observer.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean delveAplicar(Orcamento orcamento) {
        return true;
    }
}
