package demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App1 {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Author author=new Author();
		author.setName("Bommana Venkatesh");
		Book book1=new Book();
		book1.setTitle("JAVA");
		Book book2=new Book();
		book2.setTitle("REACT");
		book1.setAuthor(author);
		book2.setAuthor(author);
		author.getBooks().add(book1);
		author.getBooks().add(book2);
		session.beginTransaction();
		session.persist(author);
		session.getTransaction().commit();
		Book book=session.find(Book.class, 1);
		System.out.println(book.getAuthor().getName());
		Author auth=session.find(Author.class, 1);
		System.out.println(auth.getName());
		session.close();
		for(Book b:auth.getBooks()) {
			System.out.println(b.getTitle());
		}
		
		
		
		
	}

}
