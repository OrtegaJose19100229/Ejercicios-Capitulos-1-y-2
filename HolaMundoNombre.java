/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;
import java.util.Scanner;
public class HolaMundoNombre 
{
    public void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        //MENSAJE PARA EL USUARIO
        System.out.println("INGRESE NOMBRE, EDAD, ALTURA");
        //LEEMOSNOMBRE
        String nombre = scanner.next();
        //LEEMOS EDAD
        int edad = scanner.nextInt();
        //LEEMOS ALTURA
        double altura = scanner.nextDouble();
        //MOSTRAMOS LOS DATOS
        System.out.println("Nombre: "+nombre
        +"Edad: "+ edad
        +"Altura: "+ altura);
        
    }
}
