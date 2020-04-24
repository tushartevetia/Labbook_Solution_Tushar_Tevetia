package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.Author;
import config.MyFactory;

public class AuthorDao {

	EntityManager em=MyFactory.getEntityManager();
	EntityTransaction tx=em.getTransaction();
	public String addAuthor(Author author) {
		tx.begin();
		em.persist(author);
		tx.commit();
		return "! Author added !";
	}
	public Author getAuthorById(int authorId) {
		Author author = em.find(Author.class, authorId);
		return author;
	}
	public String removeAuthorById(int authorId) {
		tx.begin();
		Author author=em.find(Author.class, authorId);
		em.remove(author);
		tx.commit();
		return "! Author removed !";
	}
	public String updateAuthorById(int authorId,Author author) {
		tx.begin();
		Author author1=em.find(Author.class, authorId);
		author1.setFirstName(author.getFirstName());
		author1.setLastName(author.getLastName());
		author1.setPhoneNo(author.getPhoneNo());
		tx.commit();
		return "! Author Updated !";
	}
}
