package com.lloyd.Mini_Library_System.RestController;


import com.lloyd.Mini_Library_System.Entity.Book;
import com.lloyd.Mini_Library_System.Services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    //define fields
    private BookService bookService;

    //inject constructor
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    //find all books
    @GetMapping("/books")
    public List<Book> findall(){

        return bookService.getAllBooks();
    }

    //find books by id
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable int id){
        return bookService.findId(id);
    }

    //add/create books
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return bookService.save(book);
    }

    //update books
    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book){
        return bookService.save(book);
    }

    //delete books
    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable int id){
        bookService.deleteById(id);
        return "Book has been deleted with id: " + id;
    }
}
