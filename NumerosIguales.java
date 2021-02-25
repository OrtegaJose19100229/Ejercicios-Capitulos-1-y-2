/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.Ejercicios;

import java.util.Scanner;
public class NumerosIguales 
{
    public static void main(String[]args)
    {
    Scanner scanner = new Scanner(System.in);
    double n1,n2;
    System.out.println("Capture un numero: ");
    n1= scanner.nextDouble();
    
    System.out.println("Capture otro Numero:");
    n2= scanner.nextDouble();
    
        if (n1==n2)
        {
        System.out.println("LOS NUMEROS SON IGUALES ");    
        }
        else
        {
        System.out.println("LOS NUMEROS SON DIFERENTES");
        }
    }
}
