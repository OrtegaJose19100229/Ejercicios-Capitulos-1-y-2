/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02;

import java.util.Scanner;
public class TestFecha3 
{
    public static void main(String[]args)
    {
    Scanner scanner = new Scanner(System.in);
    //SE PIDEN LOS DATOS DE LA FECHA MEDIENTE LECTURA
    System.out.println("INGRESE EL DIA, MES, AÑO: (NUMEROS)");
    int Dia= scanner.nextInt();
    int Mes= scanner.nextInt();
    int Anio= scanner.nextInt();
    
    //SE CREA UN OBJETO DE LA CLASE FECHA
    Fecha miFecha1= new Fecha(Dia,Mes,Anio);//PARAMETROS DEL CONSTRUCTOR
    //SE PIDEN LOS DATOS DE LA FECHA MEDIENTE LECTURA
    System.out.println("INGRESE EL DIA, MES, AÑO: (NUMEROS)");
    Dia= scanner.nextInt();
    Mes= scanner.nextInt();
    Anio= scanner.nextInt();
    
    //SE CREA UN SEGUNDO OBJETO
    Fecha miFecha2 = new Fecha(Dia,Mes,Anio);
    
    System.out.println("FECHA 1: "+ miFecha1);
    System.out.println("FECHA 2: "+miFecha2);
    
        if (miFecha1.equals(miFecha2))
        {
            System.out.println("SON IGUALES");
        }
        else
        {
        System.out.println("SON DISTINTAS");
        
        }
    }
    
}
