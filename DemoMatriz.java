/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.Scanner;

public class DemoMatriz
{
    public static void main (String []args)
    {
    Scanner scanner = new Scanner(System.in);
    //SE PREGUNTA LA CANTIDAD DE FILAS Y COLUMNAS QUE REQUIERE
    System.out.println("INGRESE LA CANTIDAD DE FILAS: ");
    int Filas = scanner.nextInt();
    System.out.println("INGRESE LA CANTIDAD DE COLUMNAS: ");
    int Columnas = scanner.nextInt();
    //SE CREA UNA MATRIZ POR LA CANTIDAD DE FILAS Y COLUMNAS INGRESADAS
    int Matriz[][] = new int [Filas][Columnas];
    
    int Numero;
        for (int IteradorF = 0; IteradorF < Filas ;  IteradorF++) 
        {
            for (int IteradorC = 0; IteradorC < Columnas; IteradorC++)
            {
                //SE GENERAN NUMEROS ALEATORIOS Y SE ASIGNAN A LA VARIABLE
                //NUMERO
                Numero=(int)(Math.random()*1000);
                //SE ASIGNA EL NUMERO A LA MATRIZ
                Matriz[Filas][Columnas]= Numero;
            }
            
        }
     for (int IteradorF = 0; IteradorF < Filas ;  IteradorF++) 
        {
            for (int IteradorC = 0; IteradorC < Columnas; IteradorC++)
            {
                //SE IMPRIMEN LAS CELDAS DE LA MATRIZ
                System.out.println(Matriz[Filas][Columnas]+"\t" );
            }
            System.out.println();
        }      
    }
}
