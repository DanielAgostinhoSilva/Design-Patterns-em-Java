package br.com.design.pattern.strategy.imposto;

import br.com.design.pattern.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpotos {

    public BigDecimal calcular(Orcamento orcamento, Imposto tipoImposto) {
        return tipoImposto.calcular(orcamento);
    }
}
