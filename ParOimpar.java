/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.Scanner;
public class ParOimpar {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE UN VALOR: ");
        int valor = scanner.nextInt();
        //SE DIVIDE ENTRE 2 EL VALOR INGRESADO
        int resto = valor % 2;
        //PARA PREGUNTAR POR EL IGUAL USAMOS ==
        if (resto==0) 
        {
            System.out.println("ESTE VALOR ES PAR");
        }
        else
        {
            System.out.println("ESTE VALOR ES IMPAR");
        }
    }
    
}
