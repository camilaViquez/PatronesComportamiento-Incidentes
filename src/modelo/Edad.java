/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.DTODinamica;
import java.util.ArrayList;

/**
 *
 * @author tanzanita
 */
public class Edad extends ConsultaDecorator{

    public Edad(ConsultaDinamica consultaDinamica) {
        super(consultaDinamica);
    }

    @Override
    public ArrayList<String> getDescripcion(DTODinamica dto) {
        ArrayList<String> resultado = new ArrayList<String>();
        resultado = resultado = getConsultaDinamica().getDescripcion(dto);
        resultado.add(dto.getEdad().get(0));
        return resultado;
    }
    
}
