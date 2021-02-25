/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Colecciones;

import java.util.Scanner;
public class TestMiColeccion
{
     public static void main(String[] args)
     {   
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Ingrese Nombre: ");  
         String nom=scanner.next(); 
         
         miColeccion <String> mc = new miColeccion<String>(5);
         
         
         while( !nom.equals("FIN") )  
         {
             // inserto siempre en la posicion 0
             mc.Insertar(nom,0);
             // leo el siguiente nombre
             nom=scanner.next();
         } 
        
         String Aux;
         for (int i = 0; i < mc.cantidad(); i++) 
         {
               Aux = (String) mc.obtener(i);    
               System.out.println(Aux +" - "+Aux.length()+" caracteres"); 
         }
     } 
}
