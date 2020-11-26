package com.easytravel;

import com.parametrizacao.Cartao;

public class CartaoCredito extends Cartao{
    
    private final String TIPO = "Cartão de Crédito";
    private double limite;

    public CartaoCredito(String numeroCartao, String nomeTitular, String validade, int codigo, int numeroParcelas, double limiteCartao){
        this.numeroCartao = numeroCartao;
        this.titular = nomeTitular;
        this.validade = validade;
        this.cvv = codigo;
        this.maximoParcelas = numeroParcelas;
        this.limite = limiteCartao;
    }

    @Override
    public void setNumeroCartao(String numero) {
        this.numeroCartao = numero;
    }

    @Override
    public String getNumeroCartao() {
        return this.numeroCartao;
    }

    @Override
    public void setTitular(String nome) {
        this.titular = nome;
    }

    @Override
    public String getTitular() {
        return this.titular;
    }

    @Override
    public void setValidade(String data) {
        this.validade = data;
    }

    @Override
    public String getValidade() {
        return this.validade;
    }

    @Override
    public void setCvv(int numero) {
        this.cvv = numero;
    }

    @Override
    public int getCvv() {
        return this.cvv;
    }

    @Override
    public void setMaximoParcelas(int numero) {
        this.maximoParcelas = numero;
    }

    @Override
    public int getMaximoParcelas() {
        return this.maximoParcelas;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    @Override
    public String imprimeDados() {
        return "Número do cartão: " + getNumeroCartao() + "\nTitular do cartão: " + getTitular() + "\nValidade: " + getValidade() + "\nCvv: " + Integer.toString(getCvv());
    }
}
