/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;


public class Cadenas3 
{
    public void main (String []args)
    {
    String Cadena= "Esto Es Una Cadena De Caracteres";
    
    String Cadena1= Cadena.substring(0,7);
    String Cadena2=Cadena.substring(8,11);
    //TOMA DESDE EL CARACTER 8 HASTA EL ULTIMO
    String Cadena3= Cadena.substring(8);
    
    System.out.println(Cadena1);
    System.out.println(Cadena2);
    System.out.println(Cadena3);
    }
}
