/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Entity.VistaLibro;
import Interfaces.VistaLibroFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author NATHALY
 */
@ManagedBean(name = "controlv")
@ViewScoped
public class ControladorVista {

     @EJB
    VistaLibroFacadeLocal viewFacade;
    
    private List<VistaLibro> listavista;

    public ControladorVista() {
        
    }
    @PostConstruct
    public void iniciar(){
        listavista = new ArrayList();
        listavista = viewFacade.findAll();
    }

    public VistaLibroFacadeLocal getViewFacade() {
        return viewFacade;
    }

    public void setViewFacade(VistaLibroFacadeLocal viewFacade) {
        this.viewFacade = viewFacade;
    }

    public List<VistaLibro> getListavista() {
        return listavista;
    }

    public void setListavista(List<VistaLibro> listavista) {
        this.listavista = listavista;
    }
    
    public void llenarLista() {
        listavista = viewFacade.findAll();
    }

    public List<VistaLibro> listarView() {
        return viewFacade.reporte();
    }
    
    
    
}
