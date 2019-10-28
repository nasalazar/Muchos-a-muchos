package Entity;

import Entity.Autor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-27T22:41:48")
@StaticMetamodel(Libro.class)
public class Libro_ { 

    public static volatile SingularAttribute<Libro, Integer> idl;
    public static volatile SingularAttribute<Libro, String> editorial;
    public static volatile ListAttribute<Libro, Autor> listaAutor;
    public static volatile SingularAttribute<Libro, String> nombre;

}