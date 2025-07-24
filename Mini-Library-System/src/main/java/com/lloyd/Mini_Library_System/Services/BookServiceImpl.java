package com.lloyd.Mini_Library_System.Services;

import com.lloyd.Mini_Library_System.Entity.Book;
import com.lloyd.Mini_Library_System.Exceptions.BookNotFoundException;
import com.lloyd.Mini_Library_System.Repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    //define book repository
    private BookRepository bookRepository;

    //inject
    @Autowired
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    //get all books
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    //get books by id
    @Override
    public Book findId(int theId) {
        return bookRepository.findById(theId)
                .orElseThrow(() -> new BookNotFoundException("Book not found ID: " + theId));
    }


    // add book
    @Transactional
    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }


    //delete books
    @Transactional
    @Override
    public void deleteById(int theId) {
       bookRepository.deleteById(theId);
    }
}
