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
public class EstudianteP {
    
     private int ide;
    
  
    private String nombre;
    
    
    private int codigo;
    
    
    private int curso;

   
    private List<Estudiante_Materia> listaEstMp;

    public EstudianteP() {
    }

    public EstudianteP(String nombre, int codigo, int curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public List<Estudiante_Materia> getListaEstMp() {
        return listaEstMp;
    }

    public void setListaEstMp(List<Estudiante_Materia> listaEstMp) {
        this.listaEstMp = listaEstMp;
    }
    
    
}
