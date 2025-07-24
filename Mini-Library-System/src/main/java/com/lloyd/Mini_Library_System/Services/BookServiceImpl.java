package com.lloyd.Mini_Library_System.Services;

import com.lloyd.Mini_Library_System.Entity.Book;
import jakarta.transaction.Transactional;

import java.util.List;

public class BookServiceImpl implements BookService{

    @Override
    public List<Book> getAllBooks() {
        return List.of();
    }

    @Override
    public Book findId(int theId) {
        return null;
    }

    @Transactional
    @Override
    public Book save(Book book) {
        return null;
    }

    @Transactional
    @Override
    public void deleteById(int theId) {

    }
}
