/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;


public class Cadenas5a
{
    public static void main (String []args)
    {
    //SE OBTIENE EL MILISEGUNDO ACTUAL
        long Hi= System.currentTimeMillis();
        //SE INSTANCIA UN StringBuffer VACIO
        StringBuffer StringBffr = new StringBuffer();
        //SE CONCATENAN N CARACTERES    
        int n = 100000;
        char c;
        for (int i = 0; i < n; i++) 
        {
            //SE OBTIENEN LOS CARACTERES ENTRE 'A' Y 'Z'
            c = (char)('A'+i%('Z'-'A'+1));
            //CONCATENO EL CARACTER EN EL StringBuffer
            StringBffr.append(c);
        }
        //SE OBTIENE EL MILI SEGUNDO
        long Hf= System.currentTimeMillis();
        //SE IMPRIME LA CADENA
        System.out.println(StringBffr.toString());
        //SE IMPRIME LA CANTIDAD DE MILISEGUNDOS CONSUMIDOS
        System.out.println((Hf-Hi)+" milisegundos");
    }
        
        
    
}
