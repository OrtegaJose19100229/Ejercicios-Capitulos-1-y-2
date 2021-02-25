/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;


public class DemoCaracteres3 {
     public static void main (String []args)
    {
        char Caracter;
        for (int i = 'A'; i <'Z'; i++) 
        {
            //DEBEMOS CASTEAR DE ENTERO A CARACTER
            Caracter=(char)i;
            System.out.println(Caracter);
        }
    }
}
