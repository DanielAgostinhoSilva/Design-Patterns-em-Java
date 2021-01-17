package br.com.design.pattern.command.orcamento.situacao;

import br.com.design.pattern.command.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
