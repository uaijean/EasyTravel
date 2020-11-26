package com.easytravel;

import com.parametrizacao.Cartao;

public class CartaoDebito extends Cartao{
    
    private final String TIPO = "Cartão de Débito";
    private double saldo;

    public CartaoDebito(String numeroCartao, String nomeTitular, String validade, int codigo, double saldoConta){
        this.numeroCartao = numeroCartao;
        this.titular = nomeTitular;
        this.validade = validade;
        this.cvv = codigo;
        this.maximoParcelas = 1;
        this.saldo = saldoConta;
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

    @Override //Para transações do tipo débito, número máximo de parcelas sempre será 1.
    public void setMaximoParcelas(int numero) {
        this.maximoParcelas = 1;
    }

    @Override
    public int getMaximoParcelas() {
        return this.maximoParcelas;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }


    @Override
    public String imprimeDados() {
        return "Número do cartão: " + getNumeroCartao() + "\nTitular do cartão: " + getTitular() + "\nValidade: " + getValidade() + "\nCvv: " + Integer.toString(getCvv());
    }
}
