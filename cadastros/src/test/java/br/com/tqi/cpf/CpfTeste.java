package br.com.tqi.cpf;

import br.com.tqi.cadastros.Cpf;
import org.junit.Test;

import java.lang.annotation.Target;

import static org.junit.Assert.*;


public class CpfTeste {
    @Test
    public void testeCpfInvalido() {
        Cpf cpf = new Cpf();
        String cpfInvalido="123456871";
        assertFalse(cpf.validaCpf(cpfInvalido));
    }

    @Test
    public void testeCpfValido() {
        Cpf cpf = new Cpf();
        String cpfValido = "128.423.777-11";
        assertTrue(cpf.validaCpf(cpfValido));
    }

}



