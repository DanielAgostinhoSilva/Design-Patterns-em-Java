package br.com.design.pattern.state.desconto;

import br.com.design.pattern.state.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
       Desconto desconto = new DescontoParaOrcamentoMaisDeCincoItens(
               new DescontoParaProdutosComValorAcimaDeQuinhetos(new SemDesconto())
       );

        return desconto.calcular(orcamento);
    }
}
