/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.DTOComportamiento;

/**
 *
 * @author tanzanita
 */
public abstract class ConsultaDecorator implements ConsultaDinamica{
    
    private ConsultaDinamica consultaDinamica;
    public ConsultaDecorator(ConsultaDinamica consultaDinamica) {
        setConsultaDinamica(consultaDinamica);
    }
    
    public ConsultaDinamica getConsultaDinamica(){
        return consultaDinamica;
    }
    public void setConsultaDinamica(ConsultaDinamica consultaDinamica){
        this.consultaDinamica = consultaDinamica;
    }
    
}
