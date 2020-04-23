package br.com.tqi.cadastros;

//Realiza validação d cálculo de digito verificador de CPF

public class Cpf {
   public boolean validaCpf(String cpf) {
        if ((cpf == null) || (cpf.length() != 14)) {
            return false;
        }
        //128.423.776-13
       //Validação do valor final determinado na string cpftresprimeirosdigitos
        String cpftresprimeirosdigitos = cpf.substring(0, 4);
        if (!cpftresprimeirosdigitos.endsWith(".")) {
            return false;
        }
    //Validação do valor final determinado na string cpftresproximosdigitos
        String cpfproximostresdigitos = cpf.substring(4, 8);
        if (!cpfproximostresdigitos.endsWith(".")) {
            return false;
        }
    //Validação do valor final determinado na string cpfultimosdigitos
        String cpfultimostresdigitos = cpf.substring(8,12);
        if (!cpfultimostresdigitos.endsWith("-")){
            return false;
        }
    //Validação do valor final determinado na string cpfdigitosfinais
        String[]cpfdigitosfinais = cpf.split("-");
        if (cpfdigitosfinais[1].length()!=2) {
            return false;
        }

        return true;
    }
}

