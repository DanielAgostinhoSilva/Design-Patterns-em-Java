package br.com.design.pattern.state.orcamento;

import br.com.design.pattern.state.orcamento.situacao.EmAnalise;
import br.com.design.pattern.state.orcamento.situacao.SituacaoOrcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
public class Orcamento {
    private BigDecimal valor;
    private int quantidadeDeItens;
    @Setter
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeDeItens) {
        this.valor = valor;
        this.quantidadeDeItens = quantidadeDeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDeescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDeescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }
}
