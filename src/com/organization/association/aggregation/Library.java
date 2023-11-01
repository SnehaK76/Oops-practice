package com.organization.association.aggregation;

public class Library {
	
	String name;
	Book[] books;
	
	public Library() {
		super();
	}
	
	public Library(String name) {
		super();
		this.books = new Book[5];
	}
	
	public Book[] showAllBooks() {
		for(Book b : books) {
			if(b != null) {
				System.out.println("Book Details : TITTLE " + b.getTittle() + "and Auther " + b.getAuther());
			}
		}
		return this.books;
	}
	
	public Book[] showAllBooksOfGivenAuther(String auther) {
		for(Book b : books) {
			if(b.getAuther().equalsIgnoreCase(auther)) {
				System.out.println("Book Details : TITTLE " + b.getTittle() + "and Auther " + b.getAuther());
			}
		}
		return this.books;
	}
	
	public Book[] addNewBook(Book newBook) {
		
		int counter = 0;
		for(int i = 0; i<books.length; i++) {
			if(books[i] == null) {
				books[i] = newBook;
				break;
			}else {
				counter ++;
			}
		}
		if(counter == books.length) {
			System.out.println("Library capacity is full ... Cannot add new book!!");
		}else {
			System.out.println("Book added sucessfully ");
		}
		return books;
		
	}
}
