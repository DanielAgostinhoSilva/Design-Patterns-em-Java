package br.com.design.pattern.templatemethod;

import br.com.design.pattern.templatemethod.desconto.CalculadoraDeDescontos;
import br.com.design.pattern.templatemethod.orcamento.Orcamento;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.math.BigDecimal;

@SpringBootTest
class TemplateMethodApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    public void quando_quantidade_de_item_for_maior_que_cinco_deve_realizar_um_desconto() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 7);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        BigDecimal desconto = calculadoraDeDescontos.calcular(orcamento);
        Assert.isTrue(new BigDecimal("10.0").equals(desconto), "Valor do desconto está errado");
    }

    @Test
    public void quando_quantidade_o_valor_total_for_maior_que_500_deve_realizar_um_desconto() {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 1);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        BigDecimal desconto = calculadoraDeDescontos.calcular(orcamento);
        Assert.isTrue(new BigDecimal("30.00").equals(desconto), "Valor do desconto está errado");
    }

    @Test
    public void quando_nao_tiver_desconto_deve_retornar_zero() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        BigDecimal desconto = calculadoraDeDescontos.calcular(orcamento);
        Assert.isTrue(new BigDecimal("0").equals(desconto), "Valor do desconto está errado");
    }

}
