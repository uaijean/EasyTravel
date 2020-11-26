package com.trataDados;

/*Gera identificadores randomicos;
*/

import java.util.Random;

public class Identificador {
    
    public static String identificador(){
        return Integer.toString(new Random().nextInt()).substring(1,7);
    }
}
