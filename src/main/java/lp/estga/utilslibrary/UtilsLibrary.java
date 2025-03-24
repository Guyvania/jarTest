/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lp.estga.utilslibrary;

import java.util.LinkedList;

/**
 *
 * @author Guyvânia Rosa
 */
public class UtilsLibrary {

    public static void main(String[] args) {
       
    }
    
    public static double converterTemperatura(double valor, String unidadeOrigem, String unidadeDestino){
        if(unidadeOrigem.equals("C") && unidadeDestino.equals("K")){
            return valor + 273.15;
        }else if (unidadeOrigem.equals("C") && unidadeDestino.equals("F")){
            return (valor * 1.8) + 32;
        }else if (unidadeOrigem.equals("K") && unidadeDestino.equals("C")){
            return valor - 273.15;
        }else if (unidadeOrigem.equals("K") && unidadeDestino.equals("F")){
            return ((valor - 273.15) * 1.8) + 32;
        }else if (unidadeOrigem.equals("F") && unidadeDestino.equals("C")){
            return (valor - 32) * (5.0 / 9.0);
        }else if(unidadeOrigem.equals("F") && unidadeDestino.equals("K")){
            return ((valor - 32) * (5.0 / 9.0)) + 273.15;
        }
        return 0;
    }


    public static double converterDistancia(double valor, String unidadeOrigem, String unidadeDestino){
        if(unidadeOrigem.equals("m") && unidadeDestino.equals("km")){
            return valor/1000.0;
        }else if (unidadeOrigem.equals("m") && unidadeDestino.equals("mi")){
            return valor/1609.344;
        }else if (unidadeOrigem.equals("m") && unidadeDestino.equals("yd")){
            return valor*1.09361;
        }else if (unidadeOrigem.equals("km") && unidadeDestino.equals("m")){
            return valor*1000;
        }else if (unidadeOrigem.equals("km") && unidadeDestino.equals("mi")){
            return valor/1.609344;
        }else if(unidadeOrigem.equals("km") && unidadeDestino.equals("yd")){
            return valor*1093.61;
        }else if(unidadeOrigem.equals("mi") && unidadeDestino.equals("m")){
            return valor*1609.344;
        }else if(unidadeOrigem.equals("mi") && unidadeDestino.equals("km")){
            return valor*1.609344;
        }else if(unidadeOrigem.equals("mi") && unidadeDestino.equals("yd")){
            return valor*1760;
        }else if(unidadeOrigem.equals("yd") && unidadeDestino.equals("m")){
            return valor/1.09361;
        }else if(unidadeOrigem.equals("yd") && unidadeDestino.equals("km")){
            return valor/1093.61;
        }else if(unidadeOrigem.equals("yd") && unidadeDestino.equals("m")){
            return valor/1760;
        }
        return 0;
    }
    
    public static double converterPeso(double valor, String unidadeOrigem, String unidadeDestino){
        if(unidadeOrigem.equals("g") && unidadeDestino.equals("kg")){
            return valor/1000.0;
        }else if (unidadeOrigem.equals("g") && unidadeDestino.equals("lb")){
            return valor/453.59237;
        }else if (unidadeOrigem.equals("g") && unidadeDestino.equals("oz")){
            return valor*0.035274;
        }else if (unidadeOrigem.equals("kg") && unidadeDestino.equals("g")){
            return valor*1000;
        }else if (unidadeOrigem.equals("kg") && unidadeDestino.equals("lb")){
            return valor/2.20462;
        }else if(unidadeOrigem.equals("kg") && unidadeDestino.equals("oz")){
            return valor*35.274;
        }else if(unidadeOrigem.equals("lb") && unidadeDestino.equals("g")){
            return valor*453.59237;
        }else if(unidadeOrigem.equals("lb") && unidadeDestino.equals("kg")){
            return valor/2.20462;
        }else if(unidadeOrigem.equals("lb") && unidadeDestino.equals("oz")){
            return valor*16;
        }else if(unidadeOrigem.equals("oz") && unidadeDestino.equals("g")){
            return valor/28.3495;
        }else if(unidadeOrigem.equals("oz") && unidadeDestino.equals("kg")){
            return valor/35.274;
        }else if(unidadeOrigem.equals("oz") && unidadeDestino.equals("l")){
            return valor/16;
        }
        return 0;
    }
    
        
    public static double converterTempo(double valor, String unidadeOrigem, String unidadeDestino){
         if(unidadeOrigem.equals("s") && unidadeDestino.equals("min")){
            return valor/60.0;
        }else if (unidadeOrigem.equals("s") && unidadeDestino.equals("h")){
            return valor/3600;
        }else if (unidadeOrigem.equals("s") && unidadeDestino.equals("d")){
            return valor/86400;
        }else if (unidadeOrigem.equals("min") && unidadeDestino.equals("s")){
            return valor*60;
        }else if (unidadeOrigem.equals("min") && unidadeDestino.equals("h")){
            return valor/60;
        }else if(unidadeOrigem.equals("min") && unidadeDestino.equals("d")){
            return valor/1440;
        }else if(unidadeOrigem.equals("h") && unidadeDestino.equals("s")){
            return valor*3600;
        }else if(unidadeOrigem.equals("h") && unidadeDestino.equals("min")){
            return valor*60;
        }else if(unidadeOrigem.equals("h") && unidadeDestino.equals("d")){
            return valor/24;
        }else if(unidadeOrigem.equals("d") && unidadeDestino.equals("s")){
            return valor*86400;
        }else if(unidadeOrigem.equals("d") && unidadeDestino.equals("min")){
            return valor*1440;
        }else if(unidadeOrigem.equals("d") && unidadeDestino.equals("h")){
            return valor*24;
        }
        return 0;
    }
    
    public static double converterVelocidade(double valor, String unidadeOrigem, String unidadeDestino){
         if(unidadeOrigem.equals("m/s") && unidadeDestino.equals("km/h")){
            return valor*3.6;
        }else if (unidadeOrigem.equals("m/s") && unidadeDestino.equals("mph")){
            return valor*2.23694;
        }else if (unidadeOrigem.equals("m/s") && unidadeDestino.equals("kn")){
            return valor*1.94384;
        }else if (unidadeOrigem.equals("km/h") && unidadeDestino.equals("m/s")){
            return valor/3.6;
        }else if (unidadeOrigem.equals("km/h") && unidadeDestino.equals("mph")){
            return valor/1.60934;
        }else if(unidadeOrigem.equals("km/h") && unidadeDestino.equals("kn")){
            return valor/1.852;
        }else if(unidadeOrigem.equals("mph") && unidadeDestino.equals("m/s")){
            return valor/2.23694;
        }else if(unidadeOrigem.equals("mph") && unidadeDestino.equals("km/h")){
            return valor*1.60934;
        }else if(unidadeOrigem.equals("mph") && unidadeDestino.equals("kn")){
            return valor*0.868976;
        }else if(unidadeOrigem.equals("kn") && unidadeDestino.equals("m/s")){
            return valor/1.94384;
        }else if(unidadeOrigem.equals("kn") && unidadeDestino.equals("km/h")){
            return valor*1.852;
        }else if(unidadeOrigem.equals("kn") && unidadeDestino.equals("mph")){
            return valor/0.868976;
        }
        return 0;
    }
    
    public static double converterArea(double valor, String unidadeOrigem, String unidadeDestino){
         if(unidadeOrigem.equals("m2") && unidadeDestino.equals("km2")){
            return valor*3.6;
        }else if (unidadeOrigem.equals("m2") && unidadeDestino.equals("ha")){
            return valor*2.23694;
        }else if (unidadeOrigem.equals("m2") && unidadeDestino.equals("ac")){
            return valor*1.94384;
        }else if (unidadeOrigem.equals("km2") && unidadeDestino.equals("m2")){
            return valor/3.6;
        }else if (unidadeOrigem.equals("km2") && unidadeDestino.equals("ha")){
            return valor/1.60934;
        }else if(unidadeOrigem.equals("km2") && unidadeDestino.equals("ac")){
            return valor/1.852;
        }else if(unidadeOrigem.equals("ha") && unidadeDestino.equals("m2")){
            return valor/2.23694;
        }else if(unidadeOrigem.equals("ha") && unidadeDestino.equals("km2")){
            return valor*1.60934;
        }else if(unidadeOrigem.equals("ha") && unidadeDestino.equals("ac")){
            return valor*0.868976;
        }else if(unidadeOrigem.equals("ac") && unidadeDestino.equals("m2")){
            return valor/1.94384;
        }else if(unidadeOrigem.equals("ac") && unidadeDestino.equals("km2")){
            return valor*1.852;
        }else if(unidadeOrigem.equals("ac") && unidadeDestino.equals("ha")){
            return valor/0.868976;
        }
        return 0;
    }
}
