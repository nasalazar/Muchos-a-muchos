package Entity;

import Entity.Estudiante_Materia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-27T22:41:48")
@StaticMetamodel(Materia.class)
public class Materia_ { 

    public static volatile SingularAttribute<Materia, Integer> codigo;
    public static volatile SingularAttribute<Materia, Integer> idm;
    public static volatile ListAttribute<Materia, Estudiante_Materia> listaEM;
    public static volatile SingularAttribute<Materia, Integer> creditos;
    public static volatile SingularAttribute<Materia, String> nombre;

}