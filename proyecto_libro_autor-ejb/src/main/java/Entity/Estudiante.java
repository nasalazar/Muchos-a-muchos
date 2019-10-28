/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author NATHALY
 */
@Entity
@Table
public class Estudiante implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int ide;
    
    @Column
    private String nombre;
    
    @Column
    private int codigo;
    
    @Column
    private int curso;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante")
    private List<Estudiante_Materia> listaEstM;

    public Estudiante() {
    }

    public Estudiante(String nombre, int codigo, int curso) {
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

    public List<Estudiante_Materia> getListaEstM() {
        return listaEstM;
    }

    public void setListaEstM(List<Estudiante_Materia> listaEstM) {
        this.listaEstM = listaEstM;
    }
    
    

}
