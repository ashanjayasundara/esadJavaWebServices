package esad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-23T19:43:16")
@StaticMetamodel(Advertisement.class)
public class Advertisement_ { 

    public static volatile SingularAttribute<Advertisement, String> images;
    public static volatile SingularAttribute<Advertisement, Date> datetime;
    public static volatile SingularAttribute<Advertisement, Double> price;
    public static volatile SingularAttribute<Advertisement, Integer> advertisementTypeId;
    public static volatile SingularAttribute<Advertisement, String> contact;
    public static volatile SingularAttribute<Advertisement, String> description;
    public static volatile SingularAttribute<Advertisement, Integer> discount;
    public static volatile SingularAttribute<Advertisement, String> location;
    public static volatile SingularAttribute<Advertisement, Integer> id;
    public static volatile SingularAttribute<Advertisement, String> title;
    public static volatile SingularAttribute<Advertisement, Integer> userId;
    public static volatile SingularAttribute<Advertisement, Short> status;

}