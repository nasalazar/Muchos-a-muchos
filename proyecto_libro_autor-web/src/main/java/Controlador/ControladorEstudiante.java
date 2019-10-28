/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Entity.Estudiante;
import Entity.Estudiante_Materia;
import Entity.Materia;
import Interfaces.EstudianteFacadeLocal;
import Interfaces.Estudiante_MateriaFacadeLocal;
import Interfaces.MateriaFacadeLocal;
import Pojo.EstudianteP;
import Pojo.Estudiante_MateriaP;
import Pojo.MateriaP;
import java.io.Serializable;
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
@ManagedBean(name="controle")
@ViewScoped

public class ControladorEstudiante implements Serializable {

    @EJB
    private MateriaFacadeLocal materiaFacade;

    @EJB
    private EstudianteFacadeLocal estudianteFacade;
    
    @EJB
    private Estudiante_MateriaFacadeLocal estmateFacade;
    
    private MateriaP pojoMateria;
    
    private EstudianteP pojoEstudiante;
    
    private Estudiante_MateriaP pojoestMat;
    
    
    private List<Materia> listaMateria;
    
    
    private List<Estudiante> listaEstudiante;
    
    private List<Estudiante_Materia> listaestMat;
    
    
    public ControladorEstudiante() {
    }
    
    @PostConstruct
    
    public void iniciar(){
        
        pojoMateria = new MateriaP();
        pojoEstudiante = new EstudianteP();
        pojoestMat = new Estudiante_MateriaP();
        
        listaMateria = new ArrayList();
        listaEstudiante = new ArrayList();
        listaestMat = new ArrayList();
       
    }

    public MateriaFacadeLocal getMateriaFacade() {
        return materiaFacade;
    }

    public void setMateriaFacade(MateriaFacadeLocal materiaFacade) {
        this.materiaFacade = materiaFacade;
    }

    public EstudianteFacadeLocal getEstudianteFacade() {
        return estudianteFacade;
    }

    public void setEstudianteFacade(EstudianteFacadeLocal estudianteFacade) {
        this.estudianteFacade = estudianteFacade;
    }

    public Estudiante_MateriaFacadeLocal getEstmateFacade() {
        return estmateFacade;
    }

    public void setEstmateFacade(Estudiante_MateriaFacadeLocal estmateFacade) {
        this.estmateFacade = estmateFacade;
    }

    public MateriaP getPojoMateria() {
        return pojoMateria;
    }

    public void setPojoMateria(MateriaP pojoMateria) {
        this.pojoMateria = pojoMateria;
    }

    public EstudianteP getPojoEstudiante() {
        return pojoEstudiante;
    }

    public void setPojoEstudiante(EstudianteP pojoEstudiante) {
        this.pojoEstudiante = pojoEstudiante;
    }

    public Estudiante_MateriaP getPojoestMat() {
        return pojoestMat;
    }

    public void setPojoestMat(Estudiante_MateriaP pojoestMat) {
        this.pojoestMat = pojoestMat;
    }

    public List<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(List<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }

    public List<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }

    public void setListaEstudiante(List<Estudiante> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }

    public List<Estudiante_Materia> getListaestMat() {
        return listaestMat;
    }

    public void setListaestMat(List<Estudiante_Materia> listaestMat) {
        this.listaestMat = listaestMat;
    }
    
    public void crearMateria(){
      Materia mat = new Materia(pojoMateria.getNombre(), pojoMateria.getCodigo(), pojoMateria.getCreditos());    
      materiaFacade.create(mat);  
    }
    public void crearEstudiante(){
      Estudiante est = new Estudiante(pojoEstudiante.getNombre(), pojoEstudiante.getCodigo(),pojoEstudiante.getCurso());    
      estudianteFacade.create(est);  
    }
    public void agregarNota(){
        
        Materia mat = materiaFacade.find(pojoMateria.getIdm());
        Estudiante est = estudianteFacade.find(pojoEstudiante.getIde());
        
        
        
        Estudiante_Materia es = new Estudiante_Materia(pojoestMat.getNota(),mat,est);
      
        
        estmateFacade.create(es);
        
    }
    public List<Materia> listarMateria(){
        listaMateria = materiaFacade.findAll();
       
        return listaMateria;
    }
    public List<Estudiante> listarEstudiante(){
        listaEstudiante = estudianteFacade.findAll();
       
        return listaEstudiante;
    }
    
}   
    
