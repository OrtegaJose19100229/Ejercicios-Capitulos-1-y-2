/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Estaticas;

/**
 *
 * @author Usuario
 */
public final class TestEstatico 
{
    private int a=0;
    
    public void unMetodo()
    {
    System.out.println("ESTO ES UN METODO");
    
    }
public static void main(String []args)
{
    TestEstatico t = new TestEstatico();
    
System.out.println("a vale: "+ t.a);          
t.unMetodo();          
}
}
