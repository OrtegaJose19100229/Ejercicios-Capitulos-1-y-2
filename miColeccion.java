/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Colecciones;


public class miColeccion <T>
{
    //ATRIBUTOS
    private Object datos []= null;
    private int len =0;
    
    //CONSTRUCTOR
    public miColeccion(int CapacidadInicial)
    {
    datos = new Object[CapacidadInicial];
    }
    
    public T obtener(int i)
    {
    return (T)datos[i];
    }
    
    public int cantidad()
    {
    return len;
    }
    
    public void Insertar(T elm, int i)
    {
        if (len==datos.length)
        {
             Object aux[] = datos;      
             datos = new Object[datos.length*2]; 
             for(int j=0; j<len; j++)  
             {         
                 datos[j]=aux[j];   
             } 
             aux=null; 
        }
         for( int j=len-1; j>=i; j-- )   
         {         
             datos[j+1]=datos[j];
         } 
           datos[i]=elm;   
           len++; 
    }
    
    public int buscar(T elm)
    {
    int i=0;
     for( ;i<len && !datos[i].equals(elm); i++ ); 
      return i<len ? i : -1; 
    
    }
    
     public void agregar(T elm) 
     {
         Insertar(elm,len); 
     } 
     
      public T eliminar(int i)  
      {        
          Object aux = datos[i]; 
          for( int j=i; j<len-1; j++ ) 
          {      
              datos[j]=datos[j+1];     
          }     
          len--;      
          return(T) aux; 
      } 
      
    
}
