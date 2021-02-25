/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.Scanner;
public class PrimerosNumeros1 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        //SE LEE EL VALOR DE NUMERO
        System.out.println("INGRESE UN NUMERO");
        int Numero = scanner.nextInt();
        
        int Iterador = 1;
        
        while (Iterador<=Numero)
        {
            //SE IMPRIME EL VALOR DE LA ITERACION 
            //HASTA LLEGAR AL NUMERO INGRESADO
            System.out.println(Iterador);
            //SE INCREMENTA EL ITERADOR
            Iterador++;
            
        }
    }
    
}
