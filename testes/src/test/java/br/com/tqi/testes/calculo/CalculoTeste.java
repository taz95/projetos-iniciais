package br.com.tqi.testes.calculo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculoTeste {
    @Test
    public void testSomarCalculo() {
        Calculo calculo = new Calculo();
        int resultado;
        resultado = calculo.somar(11, 20);
        assertEquals(30,resultado);

    }

}
