package demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory=new Configuration().configure().buildSessionFactory();
       Session session=factory.openSession();
       session.beginTransaction();
       Person person=new Person();
       person.setName("Venky");
       Passport passport=new Passport();
       passport.setPassport_number("54321");
       passport.setPerson(person);
       person.setPassport_id(passport);
       session.persist(person);
       session.getTransaction().commit();
       Person p=session.get(Person.class, 1);
       System.out.println(p.getPassport_id().getId());
       Passport pass=session.get(Passport.class, 1);
       System.out.println(pass.getPerson().getName());
       session.close();
    
     
    }
}
