/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02;


public class TestFecha
{
    public static void main(String []args)
    {
    Fecha miFecha = new Fecha(2,10,1970);
    //SE CREA EL OBJETO CON LOS ATRIBUTOS INICIALIZADOS
   miFecha.setDia(2);
   miFecha.setMes(10);
   miFecha.setAnio(1970);
   //IMPRIMOS LA FECHA
   System.out.println("DIA:  "+miFecha.getDia());
   System.out.println("MES:  "+miFecha.getMes());
   System.out.println("AÑO:  "+miFecha.getAnio());
   //SE IMPRIME EL OBJETO
   System.out.println(miFecha);
        
    }
    
}
