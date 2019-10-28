/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entity.Autor;
import Entity.Libro;
import Interfaces.AutorFacadeLocal;
import Interfaces.LibroFacadeLocal;
import Pojo.AutorP;
import Pojo.LibroP;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author NATHALY
 */
@ManagedBean(name ="control")
@ViewScoped 
public class ControladorPrincipal implements Serializable{

    @EJB
    private AutorFacadeLocal autorFacade;

    @EJB
    private LibroFacadeLocal libroFacade;
    
    private AutorP pojoAutor;
    
    private LibroP pojoLibro;
    
    
    private List<Autor> listaautor;
    
    
    private List<Libro> listalibro;
    
     public ControladorPrincipal() {
    }
    
    
    @PostConstruct
     public void iniciar(){
    pojoAutor = new AutorP();
    pojoLibro = new LibroP();
    listaautor = new ArrayList();
    listalibro = new ArrayList();
    }

    public AutorP getPojoAutor() {
        return pojoAutor;
    }

    public void setPojoAutor(AutorP pojoAutor) {
        this.pojoAutor = pojoAutor;
    }

    public LibroP getPojoLibro() {
        return pojoLibro;
    }

    public void setPojoLibro(LibroP pojoLibro) {
        this.pojoLibro = pojoLibro;
    }

    

    public List<Autor> getListaautor() {
        return listaautor;
    }

    public void setListaautor(List<Autor> listaautor) {
        this.listaautor = listaautor;
    }

    public AutorFacadeLocal getAutorFacade() {
        return autorFacade;
    }

    public void setAutorFacade(AutorFacadeLocal autorFacade) {
        this.autorFacade = autorFacade;
    }

    public LibroFacadeLocal getLibroFacade() {
        return libroFacade;
    }

    public void setLibroFacade(LibroFacadeLocal libroFacade) {
        this.libroFacade = libroFacade;
    }

    
    
   
    public List<Libro> getListalibro() {
        return listalibro;
    }

    public void setListalibro(List<Libro> listalibro) {
        this.listalibro = listalibro;
    }
    
   
    public void crearAutor(){
      Autor aut = new Autor(pojoAutor.getNombre(),pojoAutor.getCedula());    
      autorFacade.create(aut);  
    }
    public void crearLibro(){
      Libro lib = new Libro(pojoLibro.getNombre(), pojoLibro.getEditorial());    
      libroFacade.create(lib);  
    }
    public List<Autor> listaAutor(){
        listaautor = autorFacade.findAll();
       
        return listaautor;
    }
    public List<Libro> listaLibro(){
        listalibro = libroFacade.findAll();
       
        return listalibro;
    }
    public void agregarRelacion(){
        
        Autor aut = autorFacade.find(pojoAutor.getIda());
        Libro lib = libroFacade.find(pojoLibro.getIdl());
        
//        Object consulta = libroFacade.consultaAsignacion(pojoLibro.getIdl(),pojoAutor.getIda());
//        if(consulta != null){
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "No permitido", "No se puede asignar el mismo autor y libro por segunda vez'"));
//        }else{
        aut.getListaLibro().add(lib);
        lib.getListaAutor().add(aut);
        libroFacade.edit(lib);    
        }
        
//    }
}
