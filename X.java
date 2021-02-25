/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Instancias;


public class X 
{
    private int a;
    private int b;
    
    //PROPIEDADES GET Y SET
    public int getA()
    {
        return a;
    }
    
    public void setA(int a)
    {
    this.a=a;
    }
    
    public int getB()
    {
    return b;
    }
    
    public void setB(int b)
    {
    this.b=b;
    }
    
    //CONSTRUCTOR
    public X(int A, int B)
    {
        this.a=A;
        this.b=B;
    }
    public String toString()
    {
    return " "+ a+" "+b;
    }
}
