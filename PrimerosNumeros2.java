/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.Scanner;
public class PrimerosNumeros2 {
    public static void main (String[]args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.println("INGRESE UN NUMERO");
    int Numero = scanner.nextInt();
    
    int Iterador = 1;
    do
    {
        System.out.println(Iterador);
        Iterador++;
    }
        while   (Iterador<=Numero);
    
    }
    
}
