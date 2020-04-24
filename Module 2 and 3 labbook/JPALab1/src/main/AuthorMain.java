package main;

import com.Author;

import dao.AuthorDao;

public class AuthorMain {

	public static void main(String[] args) {
		AuthorDao authorDao=new AuthorDao();
		
		//Create/add new Author
		/*
		Author author=new Author("Raj","Sharma","94100032535");
		String result=authorDao.addAuthor(author);
		System.out.println(result);
		*/
		
		//Find Author by given Author ID
		/*
		Author author=authorDao.getAuthorById(61);
	    System.out.println(author.getFirstName()+"\t"+author.getLastName()+"\t"+author.getPhoneNo());
	    */
		
		//Update details of an author
		/*
		Author author=new Author("Harish", "Sharma", "9995556660");
		String result1=authorDao.updateAuthorById(62, author);
	    System.out.println(result1);
	    */
		
		// Delete author by Author ID
		
		String result3=authorDao.removeAuthorById(65);
		System.out.println(result3);
	}
	
}
