package com.ucare.webucare.model;

import com.ucare.webucare.model.cep.ViaCEPException;
import org.json.JSONException;

import java.util.Date;

public class Profissional extends User{
    Date data;
    String hora;
    String crp;

    public Profissional(String nomeCompleto, int idade, String cpf, String cep, String endereco, String cidade, String uf, String bairro, String numero, String email, String senha, Date data, String hora, String crp) throws JSONException, ViaCEPException {
        super(nomeCompleto, idade, cpf, cep, endereco, cidade, uf, bairro, numero, email, senha);
        this.data = data;
        this.hora = hora;
        this.crp = crp;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
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
