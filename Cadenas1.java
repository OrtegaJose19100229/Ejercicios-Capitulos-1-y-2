/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;


public class Cadenas1
{
    public static void main (String []args)
    {
    String Cadena = "Esto Es Una Cadena De Caracteres";
    String CadenaMayusculas= Cadena.toUpperCase();
    String CadenaMinusculas= Cadena.toLowerCase();
    
    //IMPRIMIMOS LAS 3 CADENAS
    System.out.println("Original:  "+Cadena);
    System.out.println("Mayusculas:  "+CadenaMayusculas);
    System.out.println("Minusculas:  "+CadenaMinusculas);
    
    }
}
