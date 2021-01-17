package br.com.design.pattern.observer.orcamento.situacao;

import br.com.design.pattern.observer.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
