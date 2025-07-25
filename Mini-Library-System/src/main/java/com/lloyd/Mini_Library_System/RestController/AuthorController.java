package com.lloyd.Mini_Library_System.RestController;


import com.lloyd.Mini_Library_System.Entity.Author;
import com.lloyd.Mini_Library_System.Services.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthorController {

    private AuthorService authorService;

    //inject constructor
    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    //find all authors
    @GetMapping("/authors")
    public List<Author> findAllAuthors(){
        return authorService.findAllAuthors();
    }

    //find authors by id
    @GetMapping("/authors/{id}")
    public Author getAuthor(@PathVariable int id){
        return authorService.findById(id);
    }


}
