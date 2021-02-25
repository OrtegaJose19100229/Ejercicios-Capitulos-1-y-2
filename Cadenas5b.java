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
public class Cadenas5b 
{
    public static void main (String []args)
    {
        //OBTENEMOS EL MILISEGUNDO ACTUAL
        long hi = System.currentTimeMillis();  
        int n=100000;
        
        String Cadena="";
        char CaraI;
        for (int i = 0; i < n; i++) 
        {
            CaraI= (char)('A'+i%('Z'-'A'+1));
            //CONCATENAMOS USANDO +
            Cadena=Cadena+CaraI;
            
        }
         long hf = System.currentTimeMillis();  
         System.out.println(Cadena);
         System.out.println((hf-hi)+" milisegundos"); 
    }
}
