package com.easytravel;



public class Passagem {
    
    private String identificador;
    private Passageiro passageiro;
    private Voo voo;
    private double preco;
    private final double DESCONTO = 0.10;

    public Passagem(){

    }   
    
    public Passagem (String identificador, Passageiro passageiro, Voo voo, double preco){
        this.identificador = identificador;
        this.passageiro = passageiro;
        this.voo = voo;
        this.preco = preco;
    }

    public void setIdentificador(String id){
        this.identificador = id;
    }

    public String getIdentificador(){
        return this.identificador;
    }

    public void setPassageiro(Passageiro passageiro){
        this.passageiro = passageiro;
    }

    public Passageiro getPassageiro(){
        return this.passageiro;
    }
    
    public void setVoo(Voo voo){
        this.voo = voo;
    }

    public Voo getVoo(){
        return this.voo;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    
}
