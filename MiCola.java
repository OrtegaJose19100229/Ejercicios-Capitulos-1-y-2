/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Colecciones;


public class MiCola<T> 
{
    private static final int CapacidadInicial=5;
    private miColeccion<T> coll = new miColeccion<T>(CapacidadInicial);
    
    public void encolar(T elm)
    {
    coll.buscar(elm);
    }
    
    public T desencolar()
    {
    return coll.eliminar(0);
    }
}
