package com.betrybe.alexandria.services;

import com.betrybe.alexandria.models.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The BookService class provides business logic and operations related to books.
 */
@Service
public class BookService {

  /**
   * The repository for accessing book data.
   */
  private BookRepository bookRepository;

  /**
   * Constructs a BookService instance with the specified BookRepository.
   *
   * @param bookRepository The repository for accessing book data.
   */
  @Autowired
  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }
}
