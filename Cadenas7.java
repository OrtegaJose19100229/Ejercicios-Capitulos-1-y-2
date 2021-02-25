/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.StringTokenizer;
public class Cadenas7 
{
    public static void main(String []args)
    {
    String Cadena="Juan|Marcos|Carlos|Matias|";
    StringTokenizer St = new StringTokenizer(Cadena,"|");
    
    String Token;
    while(St.hasMoreTokens())
    {
    Token = St.nextToken();
    System.out.println(Token);
    }
    }
}
