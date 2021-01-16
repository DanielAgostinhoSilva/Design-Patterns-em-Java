package br.com.design.pattern.strategy;

import br.com.design.pattern.strategy.imposto.CalculadoraDeImpotos;
import br.com.design.pattern.strategy.imposto.ICMS;
import br.com.design.pattern.strategy.orcamento.Orcamento;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.math.BigDecimal;

@SpringBootTest
class StrategyApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void quando_passar_um_orcamento_com_imposto_icms_deve_retornar_o_calculo_do_imposto() {
        Orcamento orcamento = new Orcamento(new BigDecimal("10000"));
        CalculadoraDeImpotos calculadoraDeImpotos = new CalculadoraDeImpotos();
        BigDecimal impostoICMS = calculadoraDeImpotos.calcular(orcamento, new ICMS());
        Assert.isTrue(new BigDecimal("1000.0").equals(impostoICMS), "O calculo do imposto ICMS não está correto");
    }

}
