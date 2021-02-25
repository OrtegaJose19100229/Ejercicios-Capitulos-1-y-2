/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Figuras;

/**
 *
 * @author Usuario
 */
public class Rectangulo extends FiguraGeometrica
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
    this.Base= B;
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
    public Rectangulo(double b, double a)
    {
        super("Rectangulo");
        Base=b;
        Altura=a;
    }
    //METODO HEREDADO
    public double Area()
    {
    return Base*Altura;
    }
}
