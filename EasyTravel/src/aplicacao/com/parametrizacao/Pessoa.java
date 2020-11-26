package com.parametrizacao;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String dataNascimento;
    protected String nomeMae;
    protected String nomePai;
    protected String celular;
    
    public Pessoa(){

    }

    public void setNome(String nome){
        this.nome  = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }

    public void setDataNascimento(String data){
        this.dataNascimento = data;
    }

    public String getDataNascimento(){
        return this.dataNascimento;
    }

    public void setNomeMar(String nome){
        this.nomeMae = nome;
    }

    public String gerNomeMae(){
        return this.nomeMae;
    }

    public void setNomePai(String nome){
        this.nomePai = nome;
    }

    public String getNomePai(){
        return this.nomePai;
    }

    public void setCelular(String numero){
        this.celular = numero;
    }

    public String getCelular(){
        return this.celular;
    }    
}
