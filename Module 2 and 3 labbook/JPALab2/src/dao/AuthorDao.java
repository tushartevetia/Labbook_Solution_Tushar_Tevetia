package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import bean.Author;
import bean.Book;
import config.MyFactory;

public class AuthorDao {

	EntityManager em=MyFactory.getEntityManager();
	
	public String addAuthor(Author author,List<Book> booksList) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		author.setBook(booksList);
		em.persist(author);
		tx.commit();
		return "! Entry added !";
	}
	public List<Book> getAllBooks(){
		Query q=em.createQuery("from Book b");
		List<Book> booksList=q.getResultList();
		return booksList;
	}
	public List<Author> getBooksByAuthorName(String name){
		Query q=em.createQuery("from Author a where name=:n");
		q.setParameter("n", name);
		List<Author> booksList=q.getResultList();
		return booksList;
	}
	public List<Book> getBooksByPrice(int min,int max){
		Query q=em.createQuery("from Book b where b.price between :low and :high");
		q.setParameter("low", min);
		q.setParameter("high", max);
		List<Book> booksList;
		booksList=q.getResultList();
		return booksList;
	}
	public String getAuthorByBookId(int ISBN) {
		Book book=em.find(Book.class, ISBN);
		return book.getAuthor().getName();
	}

}
