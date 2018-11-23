/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author tanzanita
 */
public class Controlador {
     private DTODinamica dtoDinamica;
     private ConsultaDinamica consultaDinamica;

    public Controlador(DTODinamica capsulaDinamica) {
        this.dtoDinamica = capsulaDinamica;
        System.out.println(dtoDinamica.toString());
    }

     public DTODinamica procesarConsultaDinamica(DTODinamica capsulaDinamica){
         
         String rango = dtoDinamica.getRangoAno().get(0);
         if(rango == "2012"){
             
             ConsultaDinamica dinamica = new LapsoTiempo1();
             dinamica = new Provincia(dinamica);
             dinamica = new Distrito(dinamica);
             dinamica = new Canton(dinamica);
             dinamica = new Edad(dinamica);
             dinamica = new Sexo(dinamica);
             dinamica = new Rol(dinamica);
             dinamica = new TipoLesion(dinamica);
             System.out.println("HOLA: "+dinamica.getDescripcion(capsulaDinamica));

         
        }
         return capsulaDinamica;
     }
   
}
