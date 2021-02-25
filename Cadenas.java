/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

public class Cadenas
{
    public static void main (String []args)
    {
    String Cadena = "ESTA ES MI CADENA";
    System.out.println(Cadena.charAt(0));
    System.out.println(Cadena.charAt(5));
    System.out.println( Cadena.charAt(Cadena.length()-1));
    
    char c;
        for (int i = 0; i < Cadena.length(); i++) 
        {
            c=Cadena.charAt(i);
            System.out.println(i+" -> "+ c);
        }
    }
}
