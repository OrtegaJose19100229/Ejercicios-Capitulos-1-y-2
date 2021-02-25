/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Instancias;

import Libro.Cap02.Fecha;
import Libro.Cap02.FechaDetallada;
public class Persona
{
    //ATRIBUTOS
    private String Nombre;
    private String Dni;
    private Fecha fechaDeNacimiento;
    
    private int cont=0;
    
    //PROPIEDADES
    public String getNombre()
    {
    return Nombre;
    }
    
    public void setNombre(String N)
    {
    this.Nombre=N;
    }
    
    public String getDni()
    {
    return Dni;
    }
    
    public void setDni(String D)
    {
    this.Dni=D;
    }
    
    
    //CONSTRUCTOR
    public Persona(String n,String dni, Fecha fnac)
    {
    this.Nombre=n;
    this.Dni=dni;
    this.fechaDeNacimiento=fnac;
    }
    
    //METODOS
    public String toString()
    {
    cont++;
    return Nombre+ "DNI: "+Dni+"\nNacido el: "+fechaDeNacimiento+"("+cont+")";
    }
   
}
