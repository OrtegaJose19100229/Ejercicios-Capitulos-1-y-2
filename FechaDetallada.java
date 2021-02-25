/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02;

import Libro.Cap02.Fecha;
public class FechaDetallada extends Fecha 
{
    private static String Meses[]= 
    {"Enero",
    "Febrero",
    "Marzo",
    "Abril",
    "Mayo",
    "Junio",
    "Julio",
    "Agosto",
    "Septiembre",
    "Octubre",
    "Noviembre",
    "Diciembre",  
            };
    public FechaDetallada(int Dia, int Mes, int Anio)
    {
    //SE INVOCA EL CONSTRUCTOR DE LA CLASE PADRE
        super (Dia,Mes,Anio);
    }
    
    public FechaDetallada(String f)
    {
    super(f);
    }
    
    public FechaDetallada()
    {//SE INVOCA EL CONSTRUCTOR PADRE
    this(0,0,0);
    }
    
    public String toString()
    {
        return getDia()+" DE "+ Meses[getMes()-1]+" DE "+getAnio(); 
    }
}
