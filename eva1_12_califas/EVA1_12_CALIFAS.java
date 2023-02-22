/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_12_califas;

/**
 *
 * @author eduar
 */
public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
        
        String cali;
        cali = imprimirCalifas(85);//almaceno el resultado en una variable
        System.out.println("Su calificación es: "+cali);
         System.out.println("Calificación para 70 es: "+ imprimirCalifas(70));//invoco dentro de otra función
         imprimirCalifas(100);//ignoro el resultado
    }
    public static String imprimirCalifas (int califas){
        String resu = "";
        if(califas >= 91 && califas <= 1000){
            resu =  "A";
        }
        else if (califas >= 81 && califas <= 90){
            resu =  "B";
        }
        else if( califas >= 71 && califas <= 80 ){
            resu = "C";
        }
        else if(califas <= 70){
            resu = "D";
        }
        return resu;
    }
}
