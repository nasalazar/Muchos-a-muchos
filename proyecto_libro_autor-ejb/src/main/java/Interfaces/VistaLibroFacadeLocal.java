/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.VistaLibro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author NATHALY
 */
@Local
public interface VistaLibroFacadeLocal {

    void create(VistaLibro vistaLibro);

    void edit(VistaLibro vistaLibro);

    void remove(VistaLibro vistaLibro);

    VistaLibro find(Object id);

    List<VistaLibro> findAll();

    List<VistaLibro> findRange(int[] range);

    int count();
    
    public List<VistaLibro> reporte();
    
}
