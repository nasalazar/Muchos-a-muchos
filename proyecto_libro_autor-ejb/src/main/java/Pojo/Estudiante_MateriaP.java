/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

import Entity.Estudiante;
import Entity.Materia;

/**
 *
 * @author NATHALY
 */
public class Estudiante_MateriaP {
   
     
    private int idem;
    
    
    private int nota;
   
    
    private int id_materia;
    
    
    private int id_estudiante;
    
    private Materia materia;
   
    private Estudiante estudiante;

    public Estudiante_MateriaP() {
    }

    public Estudiante_MateriaP(int nota) {
        this.nota = nota;
    }

    public Estudiante_MateriaP(int nota, int id_materia, int id_estudiante) {
        this.nota = nota;
        this.id_materia = id_materia;
        this.id_estudiante = id_estudiante;
    }

    

    public int getIdem() {
        return idem;
    }

    public void setIdem(int idem) {
        this.idem = idem;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }
    
    
}
