/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

public class ReporteDistancia extends Reporte{
    
    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;
    
    public ReporteDistancia(String nombre, String carrera, String ciclo){
        super(nombre, carrera, ciclo);
        
    }
    
    public void establecerLista(ArrayList<EstudianteDistancia> listado){
        lista = listado;
    }
    
    public void establecerTotalMatriculasDistancia(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia + 
                    lista.get(i).obtenerMatriculaDistancia();
        }
    }
    
    public ArrayList<EstudianteDistancia> obtenerLista(){
        return lista;
    }
    
    public double obtenerTotalMatriculasDistancia(){
        return totalMatriculaDistancia;
    }
    
    @Override
    public String toString(){               
                    
        String cadena = String.format("Reporte Distancia\n"
                + "Carrera: %s\n"
                + "Ciclo: %s\n\n"
                + "Lista de estudiantes\n\n",          
                carrera,
                ciclo);
          
        for (int i = 0; i < lista.size() ; i++) {
            
            cadena = String.format("%s%s\n", cadena, lista.get(i));
            
        }
        
        cadena = String.format("%s\nEl total de matriculas es: %.2f",
                cadena, obtenerTotalMatriculasDistancia());
        
        return cadena;
    }
    
}
