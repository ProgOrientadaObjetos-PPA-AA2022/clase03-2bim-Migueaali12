/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

/**
 *
 * @author reroes
 */
public class Reporte {
    
   protected String codigo;

    public Reporte(String codigo) {
        this.codigo = codigo;
    }
   
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        
        String cadena;
        
        cadena = String.format("%s", codigo);
        
        return cadena;
    }
    
   
}
