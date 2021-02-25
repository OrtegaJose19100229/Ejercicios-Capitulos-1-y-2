/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Colecciones;


public class TestMiPila
{
    public static void main(String[]args)
    {
    miPila<Integer> c = new miPila<Integer>();
    
    c.apilar(1);    
    c.apilar(2);   
    c.apilar(3);
      System.out.println(c.desapilar());    
      System.out.println(c.desapilar());      
    c.apilar(4);
    
  System.out.println(c.desapilar()); 
  System.out.println(c.desapilar()); 
    }
}
