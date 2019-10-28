/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

import Entity.Autor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NATHALY
 */
public class LibroP {
    
    private int idl;
    
    private String nombre;
    
    private String editorial;
    
    private List<Autor> listaAP = new ArrayList();

    public LibroP() {
    }

    public int getIdl() {
        return idl;
    }

    public void setIdl(int idl) {
        this.idl = idl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public List<Autor> getListaAP() {
        return listaAP;
    }

    public void setListaAP(List<Autor> listaAP) {
        this.listaAP = listaAP;
    }
    
    
           
}
