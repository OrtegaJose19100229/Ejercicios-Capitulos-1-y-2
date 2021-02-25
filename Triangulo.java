/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Figuras;


public class Triangulo extends FiguraGeometrica
{
    //ATRIBUTOS
    private double Base;
    private double Altura;
    
    //PROPIEDADES GET Y SET
    public double getBase()
    {
    return Base;
    }
    
    public void setBase(double B)
    {
    this.Base=B;
    }
    
    public double getAltura()
    {
    return Altura;
    }
    public void setAltura(double A)
    {
    this.Altura=A;
    }
    //CONSTRUCTOR
    public Triangulo(double B, double A)
    {
        super ("Triangulo");
    Base = B;
    Altura = A;
    }
    //METODO HEREDADO
    public double Area()
    {
    return (Base*Altura)/2;
    }
    
}
