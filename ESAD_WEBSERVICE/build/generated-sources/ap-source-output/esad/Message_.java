package esad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-23T19:43:16")
@StaticMetamodel(Message.class)
public class Message_ { 

    public static volatile SingularAttribute<Message, Date> datetime;
    public static volatile SingularAttribute<Message, Integer> id;
    public static volatile SingularAttribute<Message, String> message;
    public static volatile SingularAttribute<Message, Integer> userId;
    public static volatile SingularAttribute<Message, Short> direction;
    public static volatile SingularAttribute<Message, Integer> status;

}