/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Interfaces;


public class TestOrdenar 
{
    public static void main(String[]args)
    {
    Alumno arr[] = { new Alumno("Juan",20,8.5)                    
            , new Alumno("Pedro",18,5.3)                  
            , new Alumno("Alberto",19,4.6)
    };
     Util.Ordenar(arr);
     muestraArray(arr);
     
      String[] arr2 = { "Pablo","Andres","Marcelo" };     
      Util.Ordenar(arr2);     
      muestraArray(arr2); 
      
       Integer[] arr3 = { new Integer(5)                       
               , new Integer(3)                       
               , new Integer(1) }; 
       
        Util.Ordenar(arr3);    
        muestraArray(arr3); 
    }
       @SuppressWarnings ("unchecked") 
       private static void muestraArray(Comparable arr[]) 
       {    
        
        for( int i=0; i<arr.length; i++ )    
       {       
           System.out.println(arr[i]);   
       }  
    } 
    }

