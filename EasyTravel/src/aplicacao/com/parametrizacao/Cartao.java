package com.parametrizacao;

public abstract class Cartao {
    protected String numeroCartao;
    protected String titular;
    protected String validade;
    protected int cvv;
    protected int maximoParcelas;

    public Cartao(){

    }

    public abstract void setNumeroCartao(String numero);

    public abstract String getNumeroCartao();

    public abstract void setTitular(String nome);

    public abstract String getTitular();

    public abstract void setValidade(String data);

    public abstract String getValidade();

    public abstract void setCvv(int numero);

    public abstract int getCvv();

    public abstract void setMaximoParcelas(int numero);

    public abstract int getMaximoParcelas();

    public abstract String imprimeDados();

}