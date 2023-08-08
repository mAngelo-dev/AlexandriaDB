package com.betrybe.alexandria.services;

import com.betrybe.alexandria.models.entities.Book;
import com.betrybe.alexandria.models.repositories.BookRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Provides book-related business logic and operations.
 */
@Service
public class BookService {

  private final BookRepository bookRepository;

  @Autowired
  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  /**
   * Inserts a new book into the database.
   *
   * @param book The book to be inserted.
   * @return The inserted book.
   */
  public Book insertBook(Book book) {
    return bookRepository.save(book);
  }

  /**
   * Updates an existing book with the provided ID.
   *
   * @param id   The ID of the book to be updated.
   * @param book The updated book data.
   * @return An Optional containing the updated book.
   */
  public Optional<Book> updateBook(Long id, Book book) {
    Optional<Book> optionalBook = bookRepository.findById(id);
    if (optionalBook.isPresent()) {
      Book bookFromDb = optionalBook.get();
      bookFromDb.setTitle(book.getTitle());
      bookFromDb.setGenre(book.getGenre());
      Book updatedBook = bookRepository.save(bookFromDb);
      return Optional.of(updatedBook);
    }
    return optionalBook;
  }

  /**
   * Removes a book from the database by its ID.
   *
   * @param id The ID of the book to be removed.
   * @return An Optional containing the removed book.
   */
  public Optional<Book> removeBookById(Long id) {
    Optional<Book> bookOptional = bookRepository.findById(id);
    if (bookOptional.isPresent()) {
      bookRepository.deleteById(id);
    }
    return bookOptional;
  }

  /**
   * Retrieves a book from the database by its ID.
   *
   * @param id The ID of the book to be retrieved.
   * @return An Optional containing the retrieved book.
   */
  public Optional<Book> getBookById(Long id) {
    return bookRepository.findById(id);
  }

  /**
   * Retrieves a list of all books in the database.
   *
   * @return A list of all books.
   */
  public List<Book> getAllBooks() {
    return bookRepository.findAll();
  }
}
