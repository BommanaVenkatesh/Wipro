package demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Employee employee1 = new Employee();
		employee1.setName("Venkatesh");
		Employee employee2 = new Employee();
		employee2.setName("Ramesh");
		Project project1 = new Project();
		project1.setTitle("Project1");
		Project project2 = new Project();
		project2.setTitle("Project2");
		Project project3 = new Project();
		project3.setTitle("Project3");
		employee1.getProjects().add(project1);
		employee1.getProjects().add(project2);
		employee1.getProjects().add(project3);
		employee2.getProjects().add(project1);
		employee2.getProjects().add(project2);
		session.beginTransaction();
		session.persist(employee1);
		session.persist(employee2);
		session.getTransaction().commit();

	}

}
