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
    private ArrayList<String> canton= new ArrayList<String>();
    private ArrayList<String> distrito= new ArrayList<String>();
    private ArrayList<String> rangoAno = new ArrayList<String>();
    private ArrayList<String> consulta = new ArrayList<String>();
    private ArrayList<String> edadQuinquenal = new ArrayList<String>();
    private ArrayList<String> edad = new ArrayList<String>();
    private ArrayList<String> sexo = new ArrayList<String>();
    private ArrayList<String> rol = new ArrayList<String>();
    private ArrayList<String> lesion = new ArrayList<String>();
    
    
//Completo
    public DTODinamica(ArrayList<String> provincia, ArrayList<String> canton,ArrayList<String> distrito, ArrayList<String> rangoAno,ArrayList<String> consulta, 
    ArrayList<String> edadQuinquenal, ArrayList<String> edad, ArrayList<String> sexo, ArrayList<String> rol, ArrayList<String> lesion) {
        this.canton=canton;
        this.consulta =consulta;
        this.distrito=distrito;
        this.edad =edad;
        this.edadQuinquenal = edadQuinquenal;
        this.lesion = lesion;
        this.provincia = provincia;
        this.rangoAno = rangoAno;
        this.rol = rol;
        this.sexo = sexo;
    }
    
//Varias provincias
    public DTODinamica(ArrayList<String> provincia, ArrayList<String> rangoAno,ArrayList<String> consulta, 
    ArrayList<String> edadQuinquenal, ArrayList<String> edad, ArrayList<String> sexo, ArrayList<String> rol, ArrayList<String> lesion) {
        this.consulta =consulta;
        this.edad =edad;
        this.edadQuinquenal = edadQuinquenal;
        this.lesion = lesion;
        this.provincia = provincia;
        this.rangoAno = rangoAno;
        this.rol = rol;
        this.sexo = sexo;
    }
    
// Sin provincia muestra datos totales
    //Varias provincias
    public DTODinamica(ArrayList<String> rangoAno,ArrayList<String> consulta, 
    ArrayList<String> edadQuinquenal, ArrayList<String> edad, ArrayList<String> sexo, ArrayList<String> rol, ArrayList<String> lesion) {
        this.consulta =consulta;
        this.edad =edad;
        this.edadQuinquenal = edadQuinquenal;
        this.lesion = lesion;
        this.rangoAno = rangoAno;
        this.rol = rol;
        this.sexo = sexo;
    }

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

    public ArrayList<String> getLesion() {
        return lesion;
    }

    public void setLesion(ArrayList<String> lesion) {
        this.lesion = lesion;
    }

    @Override
    public String toString() {
        return "DTODinamica{" + "provincia=" + provincia + ", canton=" + canton + ", distrito=" + distrito + ", rangoAno=" + rangoAno + ", consulta=" + consulta + ", edadQuinquenal=" + edadQuinquenal + ", edad=" + edad + ", sexo=" + sexo + ", rol=" + rol + ", lesion=" + lesion + '}';
    }

   
}
