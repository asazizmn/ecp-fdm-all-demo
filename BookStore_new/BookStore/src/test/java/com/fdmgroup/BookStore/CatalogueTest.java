package com.fdmgroup.BookStore;

import org.mockito.*;
import static  org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;


@ExtendWith(MockitoExtension.class)
class CatalogueTest {

	@Mock
	Book mockbook;
//	
	@Mock
	List<Book> mockbooks;
	
	@Mock
	ReadItemCommand readItemCommand;
	
	@Mock
	WriteItemCommand writeItemCommand;
	
	
	@BeforeEach
	public void TestSetup() {
		mockbooks = new ArrayList<Book>();
		
	}
	@Test
	public void getAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue(){
		//Arrange
		Catalogue catalogue = new Catalogue(mockbooks);
		catalogue.setReadItemCommand(readItemCommand);
		
		//Act
		when(readItemCommand.readAll()).thenReturn(mockbooks);
		mockbooks = catalogue.getAllBooks();
		
		//Assert
		assertEquals(mockbooks.size(),0);
	}
	
	@Test
	public void getAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
		//Arrange Act
		Catalogue catalogue = new Catalogue(mockbooks,readItemCommand);
		
//		List<Book> books = 
		when(readItemCommand.readAll()).thenReturn(mockbooks);
		catalogue.getAllBooks();
		
		
		//Assert
		verify(readItemCommand, times(1)).readAll();	
		
	}
	
	@Test
	public void getAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled(){
		//Arrange
		Catalogue catalogue = new Catalogue(mockbooks);
		catalogue.setReadItemCommand(readItemCommand);
		
		//Act
		when(readItemCommand.readAll()).thenReturn(mockbooks);
		List<Book> books = catalogue.getAllBooks();
		//Assert
		assertEquals(books,mockbooks);
		
	}

	
    @Test
    public void addBook_passBookToInsertItem() {
        // arrange
        List<Book> bookList = new ArrayList<Book>();
        Catalogue catalogue = new Catalogue(bookList, readItemCommand, writeItemCommand);


       // act
        doAnswer(invocation -> {
            //Object arg0 = invocation.getArgument(0);
            bookList.add((Book) invocation.getArgument(0));
            return null;
        }).when(writeItemCommand).insertItem(mockbook);
        
        // when(writeItemCommand.insertItem(mockbook)).thenAnswer(invocation -> bookList.add( (Book) invocation.getArgument(0) ); return null;)
        
        // choose your preferred way
        // when(dummy.stringLength("dummy")).thenAnswer(answer);
        // doAnswer(answer).when(dummy).stringLength("dummy");
        
        
        catalogue.addBook(mockbook);
    
        // assert
        assertEquals(1,bookList.size());
    }


	


}
