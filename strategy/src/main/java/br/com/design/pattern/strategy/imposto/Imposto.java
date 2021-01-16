package br.com.design.pattern.strategy.imposto;

import br.com.design.pattern.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
