/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.Scanner;

public class DemoConstantes 
{
    //DEFINES LAS CONSTANTES QUE TRABAJARAN CON EL NUMERO INGRESADA
        public static final int  LUNES = 1;
        public static final int MARTES =2;
        public static final int MIERCOLES =3;
        public static final int JUEVES = 4;
        public static final int VIERNES=5;
        public static final int SABADO =6;
        public static final int DOMINGO =7;
    public static void main (String []args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("INGRESE UN DIA DE LA SEMANA (---NUMERO---)");
        int Valor = scanner.nextInt();
        String Dia;
        switch(Valor)
        {
            case LUNES:
            Dia= "L U N E S";
            break;
            case MARTES:
                Dia= "M A R T E S";
                break;
            case MIERCOLES:
                Dia= "M I E R C O L E S";
                break;
            case JUEVES:
                Dia= "J U E V E S";
                break;
            case VIERNES:
                Dia="V I E R N E S";
                break;
            case SABADO:
                Dia= "S A B A D O";
                break;
            case DOMINGO:
                Dia="D O M I N G O ";
                break;
            default:
                Dia= "DIA INCORRECTO (---NUMEROS ENTRE 1 Y 7---)";
        }
        System.out.println(Dia);
       
    }
    
}
