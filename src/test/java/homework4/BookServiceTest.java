package homework4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    BookRepository bookRepositoryMock;
    BookService bookService;
    Book bookTest1;
    Book bookTest2;
    List<Book> bookList;

    @BeforeEach
    void setUp() {
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);
        bookTest1 = new Book("1", "Book1", "Author1");
        bookTest2 = new Book("2", "Book2", "Author2");
        bookList = new ArrayList<>();
        bookList.add(bookTest1);
        bookList.add(bookTest2);
    }

    @Test
    void findBookById() {
        when(bookRepositoryMock.findById("1")).thenReturn(bookTest1);

        Book bookRes = bookService.findBookById("1");

        assertEquals(bookRes, bookTest1);
    }

    @Test
    void findAllBooks() {
        when(bookRepositoryMock.findAll()).thenReturn(bookList);

        List<Book> resList = bookService.findAllBooks();

        assertEquals(resList, bookList);
    }
}