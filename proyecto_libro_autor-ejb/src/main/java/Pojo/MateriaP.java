/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

import Entity.Estudiante_Materia;
import java.util.List;

/**
 *
 * @author NATHALY
 */
public class MateriaP {
    
    private int idm;
    
    private String nombre;
    
    private int creditos;
    
    private int codigo;
    
    private List<Estudiante_Materia> listaEMp;

    public MateriaP() {
    }

    public MateriaP(String nombre, int creditos, int codigo) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.codigo = codigo;
    }

    public int getIdm() {
        return idm;
    }

    public void setIdm(int idm) {
        this.idm = idm;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Estudiante_Materia> getListaEMp() {
        return listaEMp;
    }

    public void setListaEMp(List<Estudiante_Materia> listaEMp) {
        this.listaEMp = listaEMp;
    }
    
    
    
}
