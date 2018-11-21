/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiproyecto.incidentes;
import controlador.DTODinamica;
import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author tanzanita
 */
public class IIProyectoIncidentes {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
       DTODinamica dto = new DTODinamica();
       ArrayList<String> canton = new ArrayList<String>();
       canton.add("Oreamuno");
       dto.setCanton(canton);
       
       ArrayList<String> distrito = new ArrayList<String>();
       distrito.add("Occidental");
       dto.setDistrito(distrito);
       
       ArrayList<String> consulta = new ArrayList<String>();
       consulta.add("jklshcdckjlsadh");
       dto.setConsulta(distrito);
       

       ArrayList<String> indicadores = new ArrayList<String>();
       indicadores.add("Femenino");
       ArrayList<String> provincia = new ArrayList<String>();
       provincia.add("Cartago");
       dto.setIndicadores(indicadores);
       dto.setProvincia(provincia);
       ArrayList<String> rangoAno = new ArrayList<String>();
       rangoAno.add("2012");
       dto.setRangoAno(rangoAno);
       
       ConsultaDinamica dinamica = new LapsoTiempo1();
       dinamica = new Distrito(dinamica);
       
        System.out.println(dinamica.getDescripcion(dto));
    }
    
}
