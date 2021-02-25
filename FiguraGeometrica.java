/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Figuras;

public abstract class FiguraGeometrica 
{
    //ATRIBUTOS
    String Nombre;
    //PROPIEDADES
    public String getNombre()
    {
    return Nombre;
    }
    public void setNombre(String N)
    {
    this.Nombre=N;
    }
    //CONSTRUCTOR
    public FiguraGeometrica(String N)
    {
    Nombre=N;
    }
    //METODO ABSTRACTO
    public abstract double Area();
    
    public String toString()
    {
    return Nombre+"(AREA ="+Area()+" )";
    }
    
    public static double AreaPromedio(FiguraGeometrica arr[])
    {
    int sum =0;
        for (int i = 0; i < arr.length; i++) 
        {
            sum+=arr[i].Area();
        }
        return sum/arr.length;
    }
    
    
}
