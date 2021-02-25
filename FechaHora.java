/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02;


public class FechaHora extends FechaDetallada
{
    //ATRIBUTOS
    private int Hora;
    private int Minuto;
    private int Segundo;
    
    //CONSTRUCTOR
    public FechaHora(String sFecha, int hora, int min, int seg)
    {
    super (sFecha);
    this.Hora=hora;
    this.Minuto=min;
    this.Segundo=seg;
    
    }
    
    public String toString()
    {
    //INVOCAMOS EL METODO TOSTRING DE LA CLASE PADRE
        return super.toString()+"( "+Hora+": "+Minuto+": "+Segundo+" )";
    }
    
    //ACCESORES GET Y SET
    
    public int getHora()
    {
    return Hora;
    }
    
    public void setHora(int Hora)
    {
    this.Hora=Hora;
    }
    
    public int getMin()
    {
    return Minuto;
    }
    
    public void setMin(int Minuto)
    {
    this.Minuto=Minuto;
    }
    
    public int getSeg()
    {
    return Segundo;
    }
    
    public void setSeg(int Segundo)
    {
    this.Segundo=Segundo;
    }
}
