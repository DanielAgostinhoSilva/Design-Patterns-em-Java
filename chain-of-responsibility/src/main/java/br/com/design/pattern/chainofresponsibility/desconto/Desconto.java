package br.com.design.pattern.chainofresponsibility.desconto;

import br.com.design.pattern.chainofresponsibility.orcamento.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Desconto {
    protected Desconto proximo;

    public abstract BigDecimal calcular(Orcamento orcamento);
}
