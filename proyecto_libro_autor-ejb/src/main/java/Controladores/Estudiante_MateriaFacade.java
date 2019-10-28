/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Interfaces.Estudiante_MateriaFacadeLocal;
import Entity.Estudiante_Materia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author NATHALY
 */
@Stateless
public class Estudiante_MateriaFacade extends AbstractFacade<Estudiante_Materia> implements Estudiante_MateriaFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_proyecto_libro_autor-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Estudiante_MateriaFacade() {
        super(Estudiante_Materia.class);
    }
    
}
