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
public class LapsoTiempo2 extends LapsoTiempo{

    @Override
    public ArrayList<String> getDescripcion(DTODinamica dto) {
        ArrayList<String> ano1 = new ArrayList<String>();
        ano1.add("2013");
        return ano1;
    }

  
}
