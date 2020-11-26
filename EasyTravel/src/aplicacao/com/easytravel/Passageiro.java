package com.easytravel;

import com.parametrizacao.Pessoa;
import com.trataDados.*;
import java.time.*;

public class Passageiro extends Pessoa {
    private String voucher;
    
    public Passageiro(String nome, String cpf, String telefone, String dataNascimento){
        
        try{
            if ((LocalDate.now().getYear() - LocalDate.parse(Datas.dataIso8601(dataNascimento)).getYear()) > 120){
                throw new IllegalArgumentException("Duvido que você seja tão velho assim!");
            }else{
                this.nome = nome;
                this.cpf = cpf;
                this.celular = telefone;
                this.dataNascimento = dataNascimento;

            }
        }catch(IllegalArgumentException err){
            err.getMessage();
        }
    }

    public void setVoucher(String id){
        this.voucher = id;
    }

    public String getVoucher(){
        return this.voucher;
    }

    public int getIdade(){
        return LocalDate.now().getYear() - LocalDate.parse(Datas.dataIso8601(this.getDataNascimento())).getYear();
    }

    public String imprimeDados(){
        return "Passageiro: " + getNome() + "\nCPF: " + getCpf() + "\nTelefone: " + getCelular() + "\nIdade: " + getIdade(); 
    }
}
