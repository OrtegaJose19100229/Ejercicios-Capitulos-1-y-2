/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String []args)
    {
    Scanner scanner =new Scanner (System.in);
    
    System.out.println("INGRESE UN DIA DE LA SEMANA (---NUMERO---).");
    int Valor = scanner.nextInt();
    
    String Dia;
    switch(Valor)
            {
            case 1:
                Dia ="L U N E S";
                break;
            case 2:
                Dia="M A R T E S";
                break;
            case 3:
               Dia ="M I E R CO L E S";
                break;
            case 4:
                Dia= "J U E V E S";
                break;
            case 5:
                Dia = "V I E R N E S";
                break;
            case 6:
                Dia ="S A B A D O";
                break;
            case 7:
                Dia= "D O M I N G O";
                break;
            default:
                Dia = "DIA NUMERICO INCORRECTO (---DEL 1 AL 7---)";
                
                
            }
    System.out.println(Dia);
    }
    
}
