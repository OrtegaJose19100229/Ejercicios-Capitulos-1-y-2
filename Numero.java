/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Estaticas;


public class Numero
{
    private double Valor;
    //PROPIEDADES
    
    public double getValor()
    {
    return Valor;
    }
    
    public void setValor(double v)
    {
    this.Valor=v;
    }
    //CONSTRUCTOR
    public Numero(double v)
    {
    Valor = v;
    }
    //METODOS
    public String toString()
    {
    return Double.toString(Valor);
    }
    
    public Numero Sumar(double a)
    {
    Valor+= a;
    return this;
    }
    
    public static double Sumar(double a, double b)
    {
    return a+b;
    }
}
