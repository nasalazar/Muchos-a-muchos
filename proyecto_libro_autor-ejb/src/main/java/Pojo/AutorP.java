/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

import Entity.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NATHALY
 */
public class AutorP {
   
    private int ida;
    
    private String nombre;
    
    private int cedula;
    
    private List<Libro> listaAP = new ArrayList();

    public AutorP() {
    }
    
    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public List<Libro> getListaAP() {
        return listaAP;
    }

    public void setListaAP(List<Libro> listaAP) {
        this.listaAP = listaAP;
    }
    

    
    
    
}
