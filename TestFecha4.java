/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02;

import java.util.Scanner;
public class TestFecha4
{
    public static void main(String []args)
    {
    Scanner scanner = new Scanner(System.in);
    //SE PIDE QUE SE INGRESE LA FECHA
    System.out.println("INGRESE LA FECHA EN FORMATO (DD,MM,AAAA)");
    //SE LEE LA FECHA INGRESADA EN UNA CADENA
    String CadenaFecha= scanner.next();
    
    //SE CREA DECLARA UN OBJETO Y SE CREA DE LA CLASE FECHA
    Fecha miFecha = new Fecha(CadenaFecha);
    //SE IMPRIME
    System.out.println("ESTA ES SU FECHA INGRESADA:  "+miFecha);
    //SE INGRESA LA CANTIDAD DE DIAS A SUMAR
    System.out.println("INGRESE UNA CANTIDAD DE DIAS A SUMAR(POSITIVOS O NEGATIOS)");
    int DiaSuma= scanner.nextInt();
    //SE LE SUMA LA CANTIDAD A LA FECHA
    miFecha.AgregarDias(DiaSuma);
    //SE IMPRIME LA NUEVA FECHA
    System.out.println("SUMANDO: "+DiaSuma+"\nDIAS, QUEDAN: "+ miFecha);
    }
    
}
