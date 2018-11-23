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
public class Provincia extends ConsultaDecorator{

    public Provincia(ConsultaDinamica consultaDinamica) {
        super(consultaDinamica);
    }

    @Override
    public ArrayList<String> getDescripcion(DTODinamica dto) {

        ArrayList<String> resultado = new ArrayList<String>();
        //crear un for y dento la consulta con cada una de las provincias del array y lo que devuelve consulta es lo que retorna, se retorna en oresultado
        resultado = getConsultaDinamica().getDescripcion(dto);
        resultado.add(dto.getProvincia().get(0));
        return resultado;    }
    
}
