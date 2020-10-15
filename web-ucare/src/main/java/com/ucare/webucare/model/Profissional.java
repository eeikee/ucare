package com.ucare.webucare.model;

import com.ucare.webucare.model.cep.ViaCEPException;
import org.json.JSONException;

public class Profissional extends User{
    String data;
    String hora;
    String crp;

    public Profissional(String nomeCompleto, int idade, String cpf, String cep, String endereco, String cidade, String uf, String bairro, String numero, String email, String senha, String data, String hora, String crp) throws JSONException, ViaCEPException {
        super(nomeCompleto, idade, cpf, cep, endereco, cidade, uf, bairro, numero, email, senha);
        this.data = data;
        this.hora = hora;
        this.crp = crp;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }

}
