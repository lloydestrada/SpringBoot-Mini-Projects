package com.lloyd.Mini_Library_System.Services;

import com.lloyd.Mini_Library_System.Entity.Book;

import java.util.List;

public interface BookService {


    //Get all books
    List<Book> getAllBooks();

    //Get book by id
    Book findId(int theId);

    //Add new book
    Book save(Book book);

    //Delete book
    void deleteById(int theId);

}
