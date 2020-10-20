package com.ucare.webucare.model;

import br.com.caelum.stella.validation.CPFValidator;
import com.ucare.webucare.model.cep.ViaCEP;
import com.ucare.webucare.model.cep.ViaCEPException;
import org.json.JSONException;

public class Paciente extends User{
    public Paciente(String nomeCompleto, int idade, String cpf, String cep, String endereco, String cidade, String uf, String bairro, String numero, String email, String senha) throws JSONException, ViaCEPException {
        super(nomeCompleto, idade, cpf, cep, endereco, cidade, uf, bairro, numero, email, senha);
    }
}
