/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.Libro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author NATHALY
 */
@Local
public interface LibroFacadeLocal {

    void create(Libro libro);

    void edit(Libro libro);

    void remove(Libro libro);

    Libro find(Object id);

    List<Libro> findAll();

    List<Libro> findRange(int[] range);

    int count();
    
//    Object consultaAsignacion(int idl , int ida);
    
}
