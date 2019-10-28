package Entity;

import Entity.Estudiante_Materia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-27T22:41:48")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ { 

    public static volatile SingularAttribute<Estudiante, Integer> codigo;
    public static volatile SingularAttribute<Estudiante, Integer> curso;
    public static volatile SingularAttribute<Estudiante, Integer> ide;
    public static volatile ListAttribute<Estudiante, Estudiante_Materia> listaEstM;
    public static volatile SingularAttribute<Estudiante, String> nombre;

}