/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.Ejercicios;

import java.util.Scanner;
public class Cuadratica
{
    public static void main(String []args)
    {
    double a,b,c,determinante,x1,x2;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("CAPTURE EL COEFICIENTE (a)");
    a = scanner.nextDouble();
    System.out.println("CAPTURE EL COEFICIENTE (b)");
    b = scanner.nextDouble();
    System.out.println("CAPTURE EL COEFICIENTE (c)");
    c = scanner.nextDouble();
    
    determinante = (b*b)- (4*a*c);
        if (determinante>0) 
        {
            x1=(-b+Math.sqrt(determinante)/ (2*9));
            x2=(-b-Math.sqrt(determinante)/ (2*9));
            System.out.println("RESULTADO X1:  "+x1);
            System.out.println("RESULTADO X1:  "+x2);
        }
        else
        {
        System.out.println("NO EXISTE UNA SOLUCION REAL AL PROBLEMA");
        }
    }
}
