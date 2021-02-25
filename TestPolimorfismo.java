/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02;

import Libro.Cap02.Fecha;
import Libro.Cap02.FechaDetallada;

public class TestPolimorfismo
{
    public static void main(String []args)
    {
    //UN OBJETO "FecD" ES DE TIPO FECHA PERO SE LE AGREGA UN OBJETO DE LA CLASE
        //FECHA DETALLADA
        Fecha FechD = new FechaDetallada("25/02/2009");
    //UN OBJETO DE TIPO OBJETO SE LE ASIGNA UN OBJETO FECHA DETALLADA
    Object miObject = new FechaDetallada("3/12/2008");
    
    //SE IMPRIMEN LOS DOS OBJETOS
    System.out.println("Fec= "+FechD);
    System.out.println("Obj= "+ miObject);
    
    }
    
}
