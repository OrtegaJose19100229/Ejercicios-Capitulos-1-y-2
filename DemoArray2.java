/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.Scanner;
public class DemoArray2 {
    public static void main(String [] args)
    {
        String dias[]= {"LUNES","MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};
        Scanner scanner = new Scanner (System.in);
        System.out.println("INGRESE UN DIA DE LA SEMANA (NUMERO)");
        int dia = scanner.nextInt();
        if (dia<=dias.length&& dia>0) 
        {
            System.out.println(dias[dia-1]);
        }
        else
        {
            System.out.println("DIA INCORRECTO");
        }
        
       
    }
    
}
