/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;

/**
 *
 * @author tanzanita
 */
public class DTODinamica {
    private ArrayList<String> provincia = new ArrayList<String>();
    private ArrayList<String> canton;
    private ArrayList<String> distrito;
    private ArrayList<String> rangoAno = new ArrayList<String>();
    private ArrayList<String> indicadores = new ArrayList<String>();
    private ArrayList<String> consulta;
    private ArrayList<String> edadQuinquenal;
    private ArrayList<String> edad;
    private ArrayList<String> sexo;
    private ArrayList<String> rol;

    public ArrayList<String> getProvincia() {
        return provincia;
    }

    public void setProvincia(ArrayList<String> provincia) {
        this.provincia = provincia;
    }

    public ArrayList<String> getCanton() {
        return canton;
    }

    public void setCanton(ArrayList<String> canton) {
        this.canton = canton;
    }

    public ArrayList<String> getDistrito() {
        return distrito;
    }

    public void setDistrito(ArrayList<String> distrito) {
        this.distrito = distrito;
    }

    public ArrayList<String> getRangoAno() {
        return rangoAno;
    }

    public void setRangoAno(ArrayList<String> rangoAno) {
        this.rangoAno = rangoAno;
    }

    public ArrayList<String> getIndicadores() {
        return indicadores;
    }

    public void setIndicadores(ArrayList<String> indicadores) {
        this.indicadores = indicadores;
    }

    public ArrayList<String> getConsulta() {
        return consulta;
    }

    public void setConsulta(ArrayList<String> consulta) {
        this.consulta = consulta;
    }

    public ArrayList<String> getEdadQuinquenal() {
        return edadQuinquenal;
    }

    public void setEdadQuinquenal(ArrayList<String> edadQuinquenal) {
        this.edadQuinquenal = edadQuinquenal;
    }

    public ArrayList<String> getEdad() {
        return edad;
    }

    public void setEdad(ArrayList<String> edad) {
        this.edad = edad;
    }

    public ArrayList<String> getSexo() {
        return sexo;
    }

    public void setSexo(ArrayList<String> sexo) {
        this.sexo = sexo;
    }

    public ArrayList<String> getRol() {
        return rol;
    }

    public void setRol(ArrayList<String> rol) {
        this.rol = rol;
    }

   
}
