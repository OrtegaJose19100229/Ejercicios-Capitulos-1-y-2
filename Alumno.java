/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Interfaces;


public class Alumno implements Comparable<Alumno>
{
    private String Nombre;
    private int Edad;
    private double NotaPromedio;
    
    //ATRIBUTOS 
    public String getNombre()
    {
    return Nombre;
    }
    public void setNombre(String n)
    {
    this.Nombre=n;
    }
    
    public int getEdad()
    {
    return Edad;
    }
    public void setEdad(int e)
    {
    this.Edad=e;
    }
    
    public double getNotaPromedio()
    {
    return NotaPromedio; 
    }
    public void setNotaPromedio(double nt)
    {
    this.NotaPromedio=nt;
    }
    //CONSTRUCTOR
    public Alumno(String nom,int e, double nt)
    {
    this.Nombre=nom;
    this.Edad=e;
    this.NotaPromedio=nt;
    }
    //METODOS
     public int compareTo(Alumno otroAlumno)  
     {     
         return this.Edad - otroAlumno.Edad;  
     } 
       public String toString()  
       {    
           return Nombre+", "+Edad+", "+NotaPromedio;  
       } 
}
