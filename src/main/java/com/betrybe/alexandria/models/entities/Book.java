package com.betrybe.alexandria.models.entities;

import jakarta.persistence.*;

/**
 * The Book class represents a book entity with its unique ID, title, and genre.
 */
@Entity
@Table(name = "books")
public class Book {

  /**
   * The unique identifier of the book.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * The title of the book.
   */
  private String title;

  /**
   * The genre of the book.
   */
  private String genre;

  /**
   * Default constructor for the Book class.
   */
  public Book() {}

  /**
   * Parameterized constructor for the Book class.
   *
   * @param id The unique identifier of the book.
   * @param title The title of the book.
   * @param genre The genre of the book.
   */
  public Book(Long id, String title, String genre) {
    this.id = id;
    this.title = title;
    this.genre = genre;
  }

  /**
   * Retrieves the unique identifier of the book.
   *
   * @return The unique identifier of the book.
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets the unique identifier of the book.
   *
   * @param id The unique identifier of the book.
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Retrieves the title of the book.
   *
   * @return The title of the book.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the title of the book.
   *
   * @param title The title of the book.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Retrieves the genre of the book.
   *
   * @return The genre of the book.
   */
  public String getGenre() {
    return genre;
  }

  /**
   * Sets the genre of the book.
   *
   * @param genre The genre of the book.
   */
  public void setGenre(String genre) {
    this.genre = genre;
  }

}
