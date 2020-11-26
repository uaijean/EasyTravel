package aplicacao;

//import java.time.*;
//import com.easytravel.Voo;

import com.emulador.Destinos;
import com.trataDados.Identificador;


//import com.easytravel.*;

public class App {
    public static void main(String[] args){
        //CartaoCredito cartao = new CartaoCredito("5555666677778888","Luiz Carlos", "12/23", 123, 12, 1200);
        //Passageiro passageiro = new Passageiro("Luiz Carlos", "0419253815", "62982779675", "02/05/1993"); 
        //System.out.println(passageiro.imprimeDados());
        //Voo voo = new Voo("BRBR002", "Goiânia", "São Paulo", LocalDate.of(2020,11,26), LocalTime.of(12,45), LocalDate.of(2020,11,27), LocalTime.of(0,1), "002", "033");
        Destinos destinos = new Destinos();

        System.out.println(Identificador.identificador());
    }
}