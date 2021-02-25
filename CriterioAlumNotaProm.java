/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Interfaces.Criterios;

import Libro.Cap02.Interfaces.Alumno;

public class CriterioAlumNotaProm extends Criterio<Alumno>
        {
      public int Comparar(Alumno a, Alumno b) 
      {      
          double diff = a.getNotaPromedio()-b.getNotaPromedio();   
          
          return diff>0 ? 1: diff <0 ? -1 : 0; 
      
      } 
}
