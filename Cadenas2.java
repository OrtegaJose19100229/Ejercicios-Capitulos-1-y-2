/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;


public class Cadenas2
{
    public static void main (String []args)
    {
    String Cadena = "Esto Es Una Cadena De Caracteres";
    int Posicion1=Cadena.indexOf('C');
    int Posicion2=Cadena.lastIndexOf('C');
    int Posicion3= Cadena.indexOf('X');
    
    System.out.println(Posicion1);
    System.out.println(Posicion2);
    System.out.println(Posicion3);
    }
}
