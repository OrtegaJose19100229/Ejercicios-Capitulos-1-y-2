/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;


public class Cadenas9 
{
    public static void main (String []args)
    {
    //GENERAMOS 2 CADENAS IGUALES
        String Cadena1="Hola";
        String Cadena2="Hola";
        
        System.out.println("CADENA 1:  =  [" + Cadena1 + "]"); 
        System.out.println("CADENA 2:  =  [" + Cadena2 + "]"); 
        
        if (Cadena1==Cadena2)
        {
            System.out.println("LAS CADENAS SON IGUALES");
        }
        else
        {
            System.out.println("LAS CADENAS SON DISTINTAS");
        }
    }
    
}
