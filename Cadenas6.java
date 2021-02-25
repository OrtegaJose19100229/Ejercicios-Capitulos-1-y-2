/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.Scanner;

public class Cadenas6 
{
    public void main (String[]args)
    {
        Scanner scanner=new Scanner(System.in); 
        System.out.print("Ingrese un valor entero: "); 
        int Valor = scanner.nextInt(); 
        
        System.out.println("Valor Ingresado: "+Valor);
        System.out.println("binario = "+Integer.toBinaryString(Valor)); 
        System.out.println("octal = "+Integer.toOctalString(Valor)); 
        System.out.println("hexadecimal = "+Integer.toHexString(Valor));
        System.out.print("Ingrese una base numerica: ");
        int BaseNum = scanner.nextInt(); 
         String SbaseNum=Integer.toString(Valor,BaseNum); 
         System.out.println(Valor + " en base (" +BaseNum+") = " + SbaseNum); 
    }
    
    }

