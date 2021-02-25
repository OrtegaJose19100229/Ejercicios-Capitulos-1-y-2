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
public class Circulo extends FiguraGeometrica
{
    //ATRIBUTOS
    private int Radio;
    //PROPIEDADES
    public int getRadio()
    {
    return Radio;
    }
    
    public void setRadio(int R)
    {
    this.Radio=R;
    }
    
    //CONSTRUCTOR
    public Circulo(int R)
    {
        super("Circulo");
    Radio=R;
    }
    //METODO HEREDADO
    public double Area()
    {
    return Math.PI*Math.pow(Radio, 2);
    }
    
}
