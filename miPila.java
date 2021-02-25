/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Colecciones;


public class miPila<T>
{
     private static final int CapacidadInicial = 5;   
     
// instancio la coleccion que mantendra los datos 
      private miColeccion<T> coll = new miColeccion<T>(CapacidadInicial); 
      
       public void apilar(T elm)  
       {    
           coll.Insertar(elm,0);  
       } 
       
        public T desapilar() 
        {    
            return coll.eliminar(0); 
        } 
}
