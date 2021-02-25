/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;


public class Cadenas4
{
public static void main (String []args)
{
    String Cadena= "Un Buen Libro De Java";
boolean Boleean1= Cadena.startsWith("Un Buen");//VERDADERO
boolean Boleean2= Cadena.startsWith("A");//FALSO
boolean Boleean3=Cadena.endsWith("Java");//VERDADERO
boolean Boleean4=Cadena.endsWith("Qchau");//FALSO

System.out.println(Boleean1);
System.out.println(Boleean2);
System.out.println(Boleean3);
System.out.println(Boleean4);
}
}
