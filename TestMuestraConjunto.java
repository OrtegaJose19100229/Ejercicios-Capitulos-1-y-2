/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02;

import Libro.Cap02.Fecha;
import Libro.Cap02.FechaDetallada;

public class TestMuestraConjunto 
{
    public static void main(String[]args)
    {
    Object []arr=
    { new Fecha(2,10,1970)
            , new FechaDetallada("23/12/1948")
            , new String("ESTO ES UNA CADENA")
            , new Integer(34)};
    //AL SER EL METODO ESTATICO SE INVOCA POR LA CLASE
    MuestraConjunto.monstrar(arr);   
    }
}
