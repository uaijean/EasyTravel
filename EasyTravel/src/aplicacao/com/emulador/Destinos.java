package com.emulador;

import java.time.LocalDateTime;

import com.trataDados.Datas;

/*Classe para emular a existência de um banco de dados com os destinos disponíveis;
**Todos os objetos desta classe são String; A tabela de destinos teria esta forma:
    
    Cidade de origem | Data e hora de partida | Cidade de destino | Data e hora de chegada
         String      |    LocalDateTime       |      String       |     LocalDateTime
*/

public class Destinos {
    String destinos[][] = new String[12][4];

    public Destinos(){
        //Primeira linha;
        this.destinos[0][0] = "Goiânia";
        this.destinos[0][1] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1));
        this.destinos[0][2] = "Brasília";
        this.destinos[0][3] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(1));

        //Segunda linha;
        this.destinos[1][0] = "Goiânia";
        this.destinos[1][1] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(1));
        this.destinos[1][2] = "São Paulo";
        this.destinos[1][3] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(6));

        //Terceira linha;
        this.destinos[2][0] = "Goiânia";
        this.destinos[2][1] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(2));
        this.destinos[2][2] = "Rio de Janeiro";
        this.destinos[2][3] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(8));


        //Quarta linha;
        this.destinos[3][0] = "Brasília";
        this.destinos[3][1] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1));
        this.destinos[3][2] = "Goiânia";
        this.destinos[3][3] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(1));


        //Quinta linha;
        this.destinos[4][0] = "Brasília";
        this.destinos[4][1] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(1));
        this.destinos[4][2] = "São Paulo";
        this.destinos[4][3] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(6));


        //Sexta linha;
        this.destinos[5][0] = "Brasília";
        this.destinos[5][1] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(2));
        this.destinos[5][2] = "Rio de Janeiro";
        this.destinos[5][3] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(8));

        //Sétima linha;
        this.destinos[6][0] = "São Paulo";
        this.destinos[6][1] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1));
        this.destinos[6][2] = "Rio de Janeiro";
        this.destinos[6][3] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(1));

        //Oitava linha;
        this.destinos[7][0] = "São Paulo";
        this.destinos[7][1] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(1));
        this.destinos[7][2] = "Goiânia";
        this.destinos[7][3] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(6));

        //Nona linha;
        this.destinos[8][0] = "São Paulo";
        this.destinos[8][1] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(2));
        this.destinos[8][2] = "Brasília";
        this.destinos[8][3] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(7));

        //Décima linha;
        this.destinos[9][0] = "Rio de Janeiro";
        this.destinos[9][1] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1));
        this.destinos[9][2] = "São Paulo";
        this.destinos[9][3] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(1));

        //Décima primeira linha;
        this.destinos[10][0] = "Rio de Janeiro";
        this.destinos[10][1] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(1));
        this.destinos[10][2] = "Goiânia";
        this.destinos[10][3] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(7));

        //Décima segunda linha;
        this.destinos[11][0] = "Rio de Janeiro";
        this.destinos[11][1] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(2));
        this.destinos[11][2] = "Brasília";
        this.destinos[11][3] = Datas.localDateTimeToString(LocalDateTime.now().plusDays(1).plusHours(8));
    }

    public String imprimeDados(){
        
        String destinos = "";
        
        for(int i = 0; i<12; i++){
            for(int j = 0; j<4; j++){
                destinos += "\n" + this.destinos[i][j];
            }
        }

        return destinos;
    }
}
