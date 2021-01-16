package br.com.design.pattern.chainofresponsibility.imposto;


import br.com.design.pattern.chainofresponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
