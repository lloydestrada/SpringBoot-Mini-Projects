package com.lloyd.Mini_Library_System.Services;

import com.lloyd.Mini_Library_System.Entity.Author;
import com.lloyd.Mini_Library_System.Exceptions.AuthorNotFoundException;
import com.lloyd.Mini_Library_System.Repository.AuthorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{

    //define fields
    private AuthorRepository authorRepository;

    //inject constructors
    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    //get all authors
    @Override
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    //get authors by id
    @Override
    public Author findById(int theId) {
        return authorRepository.findById(theId)
                .orElseThrow(() -> new AuthorNotFoundException("Author id not found: " + theId));
    }

    //add authors
    @Transactional
    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    //delete authors by id
    @Transactional
    @Override
    public void deleteById(int theId) {
        authorRepository.deleteById(theId);
    }
}
