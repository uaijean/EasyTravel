package com.trataDados;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static String dataIso8601(String data){
        return data.subSequence(6,10) + "-" + data.subSequence(3,5) + "-" + data.subSequence(0,2) ;
    }

    public static String localDateTimeToString(LocalDateTime data){
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm"));
    }
    
}
