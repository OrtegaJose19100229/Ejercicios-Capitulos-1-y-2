/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Figuras;


public class TestAreaPromedio
{
    public static void main(String[]args)
    {
    FiguraGeometrica arr[]= {new Circulo(23),
            new Triangulo(2,5),
    new Rectangulo(12,4)};
    
    double Promedio= FiguraGeometrica.AreaPromedio(arr);
    System.out.println("PROMEDIO= "+Promedio);
    }
}
