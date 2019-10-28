/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.Estudiante_Materia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author NATHALY
 */
@Local
public interface Estudiante_MateriaFacadeLocal {

    void create(Estudiante_Materia estudiante_Materia);

    void edit(Estudiante_Materia estudiante_Materia);

    void remove(Estudiante_Materia estudiante_Materia);

    Estudiante_Materia find(Object id);

    List<Estudiante_Materia> findAll();

    List<Estudiante_Materia> findRange(int[] range);

    int count();
    
}
