package com.lloyd.Mini_Library_System.Services;

import com.lloyd.Mini_Library_System.Entity.Author;

import java.util.List;

public interface AuthorService {

    //get all author
    List<Author> findAllAuthors();

    //get authors by id
    Author findById(int theId);

    //Add authors
    Author save(Author author);

    //delete authors
    void deleteById(int theId);
}
