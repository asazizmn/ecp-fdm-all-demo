package com.fdmgroup.BookStore;
import java.util.*;

@SuppressWarnings("unused")
public class Catalogue {
	
	private List<Book> books;
	private ReadItemCommand readItemCommand;
	private WriteItemCommand writeItemCommand;
	
	
	public Catalogue(List<Book> books) {
		this.books = books;
	}
	
	public Catalogue(List<Book> books, ReadItemCommand readItemCommand ) {
		this.readItemCommand = readItemCommand;
		this.books = books;
		
	}
	
	public List<Book> getAllBooks(){
		return this.readItemCommand.readAll();
	}
	
	public void addBook(Book book) {
		writeItemCommand.insertItem(book);
	}
	
	public void setReadItemCommand(ReadItemCommand readItemCommand) {
		this.readItemCommand = readItemCommand;
	}
	
	public void setWriteItemCommand(WriteItemCommand writeItemCommand) {
		this.writeItemCommand = writeItemCommand;
	}
	
	
}
