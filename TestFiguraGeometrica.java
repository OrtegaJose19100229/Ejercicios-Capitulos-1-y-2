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
public class TestFiguraGeometrica 
{
    public static void main(String[]args)
    {
    Circulo miCirculo = new Circulo(4);
    Triangulo miTriangulo= new Triangulo(3,6);
    Rectangulo miRectangulo = new Rectangulo(10,5);
    
    System.out.println(miCirculo);
    System.out.println(miTriangulo);
    System.out.println(miRectangulo);
    }
}
