package com.ucare.webucare.model;

import br.com.caelum.stella.validation.CPFValidator;
import com.ucare.webucare.model.cep.ViaCEP;
import com.ucare.webucare.model.cep.ViaCEPException;
import org.json.JSONException;

public abstract class User {
    String nomeCompleto;
    int idade;
    String cpf;
    String cep;
    String endereco;
    String cidade;
    String uf;
    String bairro;
    String numero;
    String email;
    String senha;


    public User(String nomeCompleto, int idade, String cpf, String cep, String endereco, String cidade, String uf, String bairro, String numero, String email, String senha) throws JSONException, ViaCEPException {
    ViaCEP viacep = new ViaCEP();
        viacep.buscar(cep);
        System.out.println(viacep.getBairro()+ " - " + viacep.getLogradouro());

        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.cpf = cpf;
        this.cep = cep;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
        this.bairro = bairro;
        this.numero = numero;
        this.email = email;
        this.senha = senha;
    }

    public boolean valida(String cfp){
        CPFValidator cpfValidator = new CPFValidator();
        cpfValidator.assertValid(cpf);
        return true;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
