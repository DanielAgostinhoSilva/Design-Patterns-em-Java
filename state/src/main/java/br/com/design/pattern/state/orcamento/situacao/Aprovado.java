package br.com.design.pattern.state.orcamento.situacao;

import br.com.design.pattern.state.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
       return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
