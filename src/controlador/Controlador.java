/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author tanzanita
 */
public class Controlador {
     private DTODinamica dtoDinamica;

    public Controlador(DTODinamica capsulaDinamica) {
        this.dtoDinamica = capsulaDinamica;
        System.out.println(dtoDinamica.toString());
    }
    
     
     public DTODinamica procesarConsultaDinamica(DTODinamica capsulaDinamica){
         
         
         return capsulaDinamica;
     }
}
