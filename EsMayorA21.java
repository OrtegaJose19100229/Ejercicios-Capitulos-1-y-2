/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.Scanner;
public class EsMayorA21 {
    public void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE SU EDAD: ");
        
        int edad = scanner.nextInt();
        
        if (edad>=21) {
            System.out.println("MAYOR DE EDAD");
            
        }
        else    {
            System.out.println("MENOR DE EDAD");
    }
    }
    
    
}
