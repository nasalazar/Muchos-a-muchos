
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Interfaces.LibroFacadeLocal;
import Entity.Libro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author NATHALY
 */
@Stateless
public class LibroFacade extends AbstractFacade<Libro> implements LibroFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_proyecto_libro_autor-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LibroFacade() {
        super(Libro.class);
    }
//    @Override
//    public Object consultaAsignacion(int idl, int ida){
//        
//        TypedQuery<Object> consulta = em.createNamedQuery("consulta",Object.class);
//        consulta.setParameter("idl", idl);
//        consulta.setParameter("ida", ida);
//        
//        return consulta.getSingleResult();
//    }
}
