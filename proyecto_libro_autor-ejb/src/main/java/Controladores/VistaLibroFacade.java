/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Interfaces.VistaLibroFacadeLocal;
import Entity.VistaLibro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.metamodel.Type;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

/**
 *
 * @author NATHALY
 */
@Stateless
public class VistaLibroFacade extends AbstractFacade<VistaLibro> implements VistaLibroFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_proyecto_libro_autor-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VistaLibroFacade() {
        super(VistaLibro.class);
    }

    @Override
    public List<VistaLibro> reporte() {
        List<VistaLibro> listaReporte = em.createNamedQuery("reporte", VistaLibro.class).getResultList();

          ModelMapper mp = new ModelMapper();
          java.lang.reflect.Type listType = new TypeToken<List<VistaLibro>>() {}.getType();
          List<VistaLibro> listaDto = mp.map(listaReporte, listType);
//        
           return listaDto;
    }
    
}
