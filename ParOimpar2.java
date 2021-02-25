/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.Scanner;
public class ParOimpar2 {
    public static void main (String[]args)
    {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("INGRESE UN VALOR: ");
    int Valor = scanner.nextInt();
    
    //OBTENEMOS EL RESTO DIVIENDO ENTRE 2
    int Resto = Valor % 2;
    
    //SE UTILIZA UN IF IN LINE
    String Mensaje=(Resto==0)? "ESTE VALOR ES PAR: ":"ESTE VALOR ES IMPAR";
    //SE MUESTRA EL RESULTADO DE LA DIVISION
    System.out.println(Valor +"  "+ Mensaje);
    
    }
    
}
