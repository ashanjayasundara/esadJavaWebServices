package esad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-23T19:43:16")
@StaticMetamodel(Invoice.class)
public class Invoice_ { 

    public static volatile SingularAttribute<Invoice, Date> datetime;
    public static volatile SingularAttribute<Invoice, Double> grossValue;
    public static volatile SingularAttribute<Invoice, Double> netValue;
    public static volatile SingularAttribute<Invoice, Integer> discount;
    public static volatile SingularAttribute<Invoice, Integer> id;
    public static volatile SingularAttribute<Invoice, Integer> userId;

}