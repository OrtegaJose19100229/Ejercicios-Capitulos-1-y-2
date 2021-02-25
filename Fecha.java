/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02;


public class Fecha 
{
    //ATRIBUTOS
    private int int_Dia;
    private int int_Mes;
    private int int_Anio;
    
    //SE REGRESA LA FECHA EN DIAS
    private int FechaEnDias()
    {
    return int_Anio*360+ int_Mes*30+int_Dia;
    }
    
    private void DiasEnFecha(int i)
    {//DIVIDIMOS ENTRE 360 Y OBTENEMOS EL ANIO
        int_Anio= (int)i/360;
        //CON EL RESTO DE LA DIVISION OBTENEMOS EL MES Y EL DIA
        int Resto=i%360;
        int_Mes=(int) Resto/30;
        //EL RESTO DE LA DIVISION DEL MES SE OBTIENE LOS DIAS
        int_Dia= Resto%30;
        //VALIDAR QUE NO QUEDE EN 0 EL DIA
        if (int_Dia==0)
        {
            int_Dia=30;
            int_Mes--;
        }
        //VALIDAR QUE NO QUE EN 0 EL MES
        if (int_Mes==0) 
        {
            int_Mes=12;
            int_Anio--;
        }
    }
    public void AgregarDias(int NuevoD)
    {//CONVERTIR LA FECHA A DIAS Y SUMAR 
        int Suma=FechaEnDias()+NuevoD;
    //LA FECHA EN DIA SE LE DA FORMATO
    DiasEnFecha(Suma);
    }
    
    public Fecha(String Cadena)
    {
     //SE BUSCA LA PRIMERA OCURRENCIA DE "/"
        int Posicion1=Cadena.indexOf('/');
     //SE BUSCA LA ULTIMA OCURRENCIA
     int Posicion2=Cadena.lastIndexOf('/');
     
     //PROCESAR EL DIA
     String sDia=Cadena.substring(0,Posicion1);
     int_Dia=Integer.parseInt(sDia);
     //PROCESAR EL MES
     String sMes=Cadena.substring(Posicion1+1,Posicion2);
     int_Mes=Integer.parseInt(sMes);
     //PROCESAR EL ANIO
     String sAnio=Cadena.substring(Posicion2+1);
     int_Anio=Integer.parseInt(sAnio);
        
        
    }
    
    //CONSTRUCTOR
    public Fecha(int D, int M, int A)
    {
    int_Dia=D;
    int_Mes=M;
    int_Anio=A;
    }
    //CONSTRUCTOR VACIO
    public Fecha()
    {
        
    }
    
    //METODOS
    public String toString()
    {
        //DEVOLVEMOS LA CONCATENACION DE LOS DATOS
        return "DIA: "+int_Dia+"\nMES: "+int_Mes+"\nAÑO: "+int_Anio;
    }
    
    public boolean equals(Object Nf)
    {
    Fecha miNuevaFecha=(Fecha)Nf;
    return (int_Dia==miNuevaFecha.int_Dia)&&(int_Mes==miNuevaFecha.int_Mes)&&(int_Anio==miNuevaFecha.int_Anio);
    }
    //PROPIEDADES
    public int getDia()
    {
        //REGRESA EL DIA
        return int_Dia;
    }
    
    public void setDia(int int_Dia)
    {
        //ASIGNA EL VALOR PARA DIA
        this.int_Dia= int_Dia;
    }
    
    public int getMes()
    {
    return int_Mes;
    }
    
    public void setMes(int int_Mes)
    {
    this.int_Mes= int_Mes;
    }
    
    public int getAnio()
    {
    return int_Anio;
    }
    
    public void setAnio(int int_Anio)
    {
        this.int_Anio= int_Anio;
    }
    
    
    }
    

