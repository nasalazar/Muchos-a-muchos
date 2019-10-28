package Entity;

import Entity.Libro;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-27T22:41:48")
@StaticMetamodel(Autor.class)
public class Autor_ { 

    public static volatile ListAttribute<Autor, Libro> listaLibro;
    public static volatile SingularAttribute<Autor, Integer> cedula;
    public static volatile SingularAttribute<Autor, Integer> ida;
    public static volatile SingularAttribute<Autor, String> nombre;

}