package com.easytravel;

import java.time.*;
import com.trataDados.Datas;

public class Voo {
    
    private String identificador;
    private String localPartida;
    private String localDestino;
    private LocalDateTime dataPartida;
    private LocalDateTime dataChegada;
    private Aviao aviao;
    private String portaoEmbarque;
    private String portaoDesembarque;
    
    public Voo(){

    }

    public Voo(String id, String localPartida, String localDestino, LocalDate dataPartida, LocalTime horaPartida, 
        LocalDate dataChegada, LocalTime horaChegada, String portaoEmbarque, String portaoDesembarque){
        
            this.identificador = id;
            this.localPartida = localPartida;
            this.localDestino = localDestino;
            this.dataPartida = LocalDateTime.of(dataPartida.getYear(), dataPartida.getMonthValue(), dataPartida.getDayOfMonth(),
                horaPartida.getHour(), horaPartida.getMinute());
            this.dataChegada = LocalDateTime.of(dataChegada.getYear(), dataChegada.getMonthValue(), dataChegada.getDayOfMonth(),
                horaChegada.getHour(), horaChegada.getMinute());
            //this.aviao;
            this.portaoEmbarque = portaoEmbarque;
            this.portaoDesembarque = portaoDesembarque;
    }

    public void setIdentificador(String id){
        this.identificador = id;
    }

    public String getIdentificador(){
        return this.identificador;
    }

    public void setLocalPartida(String local){
        this.localPartida = local;
    }

    public String getLocalPartida(){
        return this.localPartida;
    }

    public void setLocalDestino(String local){
        this.localDestino = local;
    }

    public String getLocalDestino(){
        return this.localDestino;
    }

    public void setDataPartida(LocalDate dataPartida, LocalTime horaPartida){
        this.dataPartida = LocalDateTime.of(dataPartida.getYear(), dataPartida.getMonthValue(), dataPartida.getDayOfMonth(),
            horaPartida.getHour(), horaPartida.getMinute());
    }

    public LocalDateTime getDataPartida(){
        return this.dataPartida;
    }

    public void setDataChegada(LocalDate dataChegada, LocalTime horaChegada){
            this.dataChegada = LocalDateTime.of(dataChegada.getYear(), dataChegada.getMonthValue(), dataChegada.getDayOfMonth(),
                horaChegada.getHour(), horaChegada.getMinute());        
    }

    public LocalDateTime getDataChegada(){
        return this.dataChegada;
    }
    
    public void setAviao(Aviao aviao){
        this.aviao = aviao;
    }
    
    public Aviao getAviao(){
        return this.aviao;
    }

    public void setPortaoEmbarque(String portao){
        this.portaoEmbarque = portao;
    }

    public String getPortaoEmbarque(){
        return this.portaoEmbarque;
    }

    public void setPortaoDesembarque(String portao){
        this.portaoDesembarque = portao;
    }

    public String getPortaoDesembarque(){
        return this.portaoDesembarque;
    }

    public String imprimeDados(){
        return "Nº do voo " + this.getIdentificador() + "\n\nOrigem " + this.getLocalPartida() + "\nData e Hora " + 
            Datas.localDateTimeToString(this.getDataPartida()) + "\nPortão Embarque " + this.getPortaoEmbarque() + "\n\nDestino " +
            this.getLocalDestino() + "\nPrevisão de chegada " + Datas.localDateTimeToString(this.getDataChegada()) + "\nPortão Desembarque " +
            this.getPortaoDesembarque();
    }

    public double calculaHorasVoo(){
        return this.dataChegada.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - this.dataPartida.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }
}
