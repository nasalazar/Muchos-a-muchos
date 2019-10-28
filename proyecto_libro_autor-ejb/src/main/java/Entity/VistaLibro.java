/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

/**
 *
 * @author NATHALY
 */
@Entity
@Table(name = "vistalibro")
@NamedNativeQueries({
    @NamedNativeQuery(name = "reporte", query = "SELECT b.idal, a.nombre AS 'nombrea', l.nombre AS 'nombrel', l.editorial AS 'editorial' FROM autor a JOIN autor_libro b ON a.ida = b.id_autor JOIN libro l ON l.idl = b.id_libro", resultClass = VistaLibro.class)
})
public class VistaLibro implements Serializable{
    
    @Id
    @Column(name = "idal", updatable = false, nullable = false)
    private int idal;
    
    @Column
    private String nombrea;
    
    @Column
    private String nombrel;
    
    @Column
    private String editorial;

    public VistaLibro() {
    }

    public VistaLibro(String nombrea, String nombrel, String editorial) {
        this.nombrea = nombrea;
        this.nombrel = nombrel;
        this.editorial = editorial;
    }

    public int getIdal() {
        return idal;
    }

    public void setIdal(int idal) {
        this.idal = idal;
    }

    

    public String getNombrea() {
        return nombrea;
    }

    public void setNombrea(String nombrea) {
        this.nombrea = nombrea;
    }

    public String getNombrel() {
        return nombrel;
    }

    public void setNombrel(String nombrel) {
        this.nombrel = nombrel;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    
}
