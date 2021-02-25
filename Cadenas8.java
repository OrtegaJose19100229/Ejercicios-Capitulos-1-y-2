/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.Scanner;

public class Cadenas8
{
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("INGRESE UNA CADENA:  ");
        String Cadena1=scanner.next();
        System.out.println("INGRESE UNA SEGUNDA CADENA:  ");
        String Cadena2=scanner.next();
        
        //SE IMPRIMEN LAS CADENAS PARA LA COMPROBACION DE LO QUE SE ESTA 
        //INGRESANDO
        System.out.println("CADENA 1: = ["+Cadena1+"]");
        System.out.println("CADENA 2: = ["+Cadena2+"]");
        //VALIDAR QUE NO SEAN IGUALES
        //NO RECOMENDADO
//        if (Cadena1==Cadena2)
//        {
//            System.out.println("LAS CADENAS SON IGUALES INTENTE DE NUEVO");
//            
//        }
//        else
//        {
//            System.out.println("LAS CADENAS SON DIFERENTES");
//        }

//COMPARACION RECOMENDADA
if (Cadena1.equals(Cadena2))
{
          System.out.println("LAS CADENAS SON IGUALES INTENTE DE NUEVO");  
        }
else
{
System.out.println("LAS CADENAS SON DIFERENTES");
}
    }
}
