package br.com.design.pattern.strategy.orcamento;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Orcamento {
    private BigDecimal valor;
}
