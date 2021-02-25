/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

/**
 *
 * @author Usuario
 */
public class Cadenas5 
{
public static void main(String[]args)
{
String Cadena ="Un Buen Libro De Java, Un Buen Material";

int Pos1=Cadena.indexOf("Buen");//RETORNA 3
int Pos2=Cadena.lastIndexOf("Buen");//RETORNA 26

System.out.println(Pos1);
System.out.println(Pos2);
}
}
