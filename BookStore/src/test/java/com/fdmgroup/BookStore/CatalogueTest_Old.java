package com.fdmgroup.BookStore;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

import org.mockito.junit.jupiter.*;
import org.mockito.stubbing.Answer;
import org.junit.jupiter.api.extension.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import java.util.*;

import org.junit.jupiter.api.*;

@ExtendWith(MockitoExtension.class)
class CatalogueTest {

	@Mock
	Book book1, book2;
	
	@Mock
	List<Book> mockbooks = new ArrayList<Book>();

	@Mock
	ReadItemCommand readItemCommand;
	WriteItemCommand writeItemCommand;

	
//	@BeforeEach
//	public void testSetup() {
//		mockbooks = new ArrayList<Book>();
//
//	}

	
	@Test
	public void getAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue() {
		// Arrange
		Catalogue catalogue = new Catalogue(mockbooks, readItemCommand);

		// Act
		when(readItemCommand.readAll()).thenReturn(mockbooks);
		mockbooks = catalogue.getAllBooks();

		// Assert
		assertEquals(mockbooks.size(), 0);
	}
	
	

	@Test
	public void getAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled() {
		// Arrange Act
		Catalogue catalogue = new Catalogue(mockbooks, readItemCommand);

//		List<Book> books = 
		when(readItemCommand.readAll()).thenReturn(mockbooks);
		catalogue.getAllBooks();

		// Assert
		verify(readItemCommand, times(1)).readAll();

	}

	@Test
	public void getAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled() {
		// Arrange
		Catalogue catalogue = new Catalogue(mockbooks, readItemCommand);
//		catalogue.setReadItemCommand(readItemCommand);

		// Act
		when(readItemCommand.readAll()).thenReturn(mockbooks);
		List<Book> books = catalogue.getAllBooks();
		// Assert
		assertEquals(books, mockbooks);

	}

	@Test
	public void test4() {
		// Arrange Act
		Book book = new Book();
		
		Catalogue catalogue = new Catalogue(mockbooks, readItemCommand);
//		catalogue.setReadItemCommand(readItemCommand);
		
		List<Book> books = catalogue.getAllBooks();
		catalogue.setWriteItemCommand(writeItemCommand);

		doAnswer((i) -> {
			System.out.println("i.getArgument(0) = " + i.getArgument(0));
			books.add((Book) i.getArgument(0));
			return null;
		}).when(writeItemCommand).insertItem(any(book1));
		
		
		catalogue.addBook(book);

		// Assert
		verify(writeItemCommand, times(1)).insertItem(book1);
//		assertEquals(mockbooks.size(),1);
	}

}
