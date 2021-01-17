package br.com.design.pattern.observer.desconto;

import br.com.design.pattern.observer.orcamento.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Desconto {
    protected Desconto proximo;

    public BigDecimal calcular(Orcamento orcamento) {
        if (delveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        }

        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    public abstract boolean delveAplicar(Orcamento orcamento);
}
