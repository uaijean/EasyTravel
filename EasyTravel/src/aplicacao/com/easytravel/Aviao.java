package com.easytravel;

public class Aviao {
   
    private String identificador;
    private int totalAssentos;
    private int assentosEconomica;
    private int assentosExecutiva;
    
    public Aviao(){

    }

    public Aviao(String id, int total, int economica, int executiva) {
        try{
            if((economica + executiva)>total){
                throw new IllegalArgumentException();
            }else{
                this.identificador = id;
                this.totalAssentos = total;
                this.assentosEconomica = economica;
                this.assentosExecutiva = executiva;
            }
        }catch (IllegalArgumentException err) {
            System.out.println("Não cabe tanta gente! Reveja seus números de Econômica e Executiva!" + err.getMessage());
        }
    }

    public void setIdentificador(String id){
        this.identificador = id;
    }

    public String getIdentificador(){
        return this.identificador;
    }

    public void setTotalAssentos(int i){
        this.totalAssentos = i;
    }

    public int getTotalAssentos(){
        return this.totalAssentos;
    }

    public void setAssentosEconomica(int i){
        this.assentosEconomica = i;
    }

    public int getAssentosEconomica(){
        return this.assentosEconomica;
    }

    public void setAssentosExecutiva(int i){
        this.assentosEconomica = i;
    }

    public int getAssentosExecutiva(){
        return this.assentosExecutiva;
    }
}
