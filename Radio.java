/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.Ejercicios;

import java.util.Scanner;
public class Radio
{
    public static void main(String[]args)
    {
    Scanner scanner = new Scanner(System.in);
    
    double radio, area;
    
    System.out.println("CAPTURE EL RADIO DEL CIRCULO");
    radio = scanner.nextDouble();
    
    area= Math.PI*Math.pow(radio, 2);
    
     System.out.println("AREA DEL CIRCULO:  "+ area);
    
    
    }
}
