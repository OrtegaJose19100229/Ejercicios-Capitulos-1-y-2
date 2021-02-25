/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.Ejercicios;

import java.util.Scanner;
public class Circunferencia 
{
    public static void main(String[]args)
    {
    Scanner scanner = new Scanner(System.in);
    
    double radio,perimetro;
    
    System.out.println("INGRESE EL RADIO DE LA CIRCUNFERENCIA: ");
    radio= scanner.nextDouble();
    
    perimetro = Math.PI*2*radio;
    
    System.out.println("RESULTADO DEL PERIMETRO: "+perimetro);
    
    }
}
