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
public class Materia implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idm;
    
    @Column
    private String nombre;
    
    @Column
    private int creditos;
    
    @Column
    private int codigo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materia")
    private List<Estudiante_Materia> listaEM;

    public Materia() {
    }

    public Materia(String nombre, int creditos, int codigo) {
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

    public List<Estudiante_Materia> getListaEM() {
        return listaEM;
    }

    public void setListaEM(List<Estudiante_Materia> listaEM) {
        this.listaEM = listaEM;
    }
    
    
}
