/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.Scanner;
public class DemoArray {
    public void main (String []args)
    {
        //SE DEFINE UN ARREGLO DE TAMANO 10
        int Arreglo [] = new int [10];
       
        Scanner scanner = new Scanner(System.in);
        
        //SE LEE EL PRIMER VALOR AGREGADO AL ARREGLO
        System.out.println("INGRESE UN VALOR: (0=>): ");
        int Valor = scanner.nextInt();
       
        //SE DECLARA EL ITERADOR
        int Iterador=0;
        //MIENTRAS EL VALOR SEA MAYOR O DIFERENTE  A 0 Y EL ITERADOR MENOR A 10 
        //CONTINUARA
        //REPITIENDO EL CICLO
        while(Valor!=0 && Iterador<10)
        {
        //SE INCREMENTA EL VALOR DE LA CELDA DEL ARREGLO Y SE ASIGNA EL VALOR
            //EN EL ARREGLO
            Arreglo[Iterador++]=Valor;
            //SE CONTINUA CON LA LECTURA DEL SIGUIENTE VALOR
            System.out.println("INGRESE EL SUIGUIENTE VALOR: (0=>): ");
        Valor = scanner.nextInt();
        }
        //SE RECORRE EL ARREGLO UTILIZANDO UN CILO FOR Y SE IMPRIMEN LOS DATOS
        //INGRESADOS
        for (int Auxiliar = 0; Auxiliar < Iterador; Auxiliar++) 
        {
            System.out.println(Arreglo[Auxiliar]);
        }
    }
    
}
