package com.ucare.webucare.model;

import br.com.caelum.stella.validation.CPFValidator;
import com.ucare.webucare.model.cep.ViaCEP;
import com.ucare.webucare.model.cep.ViaCEPException;
import org.json.JSONException;

public class User {
    String nomeCompleto;
    int idade;
    String cpf;
    String cep;


    public static void main(String[] args) throws JSONException, ViaCEPException {
        ViaCEP viacep = new ViaCEP();
        viacep.buscar(cep);
        System.out.println(viacep.getBairro()+ " - " + viacep.getLogradouro());

    }

    public boolean valida(String cfp){
        CPFValidator cpfValidator = new CPFValidator();
        cpfValidator.assertValid(cpf);
    }
}
