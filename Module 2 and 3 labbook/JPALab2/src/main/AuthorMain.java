package main;

import java.util.ArrayList;
import java.util.List;

import bean.Author;
import bean.Book;
import dao.AuthorDao;

public class AuthorMain {

	public static void main(String[] args) {
		AuthorDao dao=new AuthorDao();
		
		
		// ADD NEW AUTHOR
		/*
		Author author=new Author("Deck Hill");
		List<Book> booksList=new ArrayList<Book>();
		booksList.add(new Book("JPQL",800,author));
		String result=dao.addAuthor(author,booksList);
		System.out.println(result);
		*/
		
		
		// Get ALL BOOKS
		/*
		List<Book> booksList=dao.getAllBooks();
		System.out.println("<---List of All Books--->");
		for(Book b: booksList) {
			System.out.println("ISBN: "+b.getISBN()+"\tBookName: "+b.getTitle()+"\tBookPrice: "+b.getPrice()+"\t");
		}
		*/
		
		
		// GET BOOKS BY AUTHOR'S NAME
		/*
		String name="Sarika Sharma";
		List<Author> authorsList=dao.getBooksByAuthorName(name);
		System.out.println("Books by Author :"+name);
		for(Author author: authorsList) {
			List<Book> booksList=author.getBook();
			for(Book b:booksList) {
				System.out.println("ISBN: "+b.getISBN()+"\tBookName: "+b.getTitle()+"\tBookPrice: "+b.getPrice());
			}
		}
	    */
		
		
		// GET BOOKS WITHIN GIVEN PRICE RANGE
		/*
		List<Book> booksList=dao.getBooksByPrice(750, 900);
		System.out.println("<--- Books By Price between 750 and 900 --->");
		for(Book b: booksList) {
			System.out.println("ISBN: "+b.getISBN()+"\tBookTitle: "+b.getTitle()+"\tBookPrice: "+b.getPrice());
		}
		*/
		
		
		// GET AUTHOR NAME BY GIVEN BOOK ID
	    /*
		String authorName=dao.getAuthorByBookId(132);
	    System.out.println("Author Name for Book ID: 132 is : "+authorName);
		*/
		
	}
}

