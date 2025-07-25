package com.lloyd.Mini_Library_System.RestController;


import com.lloyd.Mini_Library_System.Entity.Author;
import com.lloyd.Mini_Library_System.Services.AuthorService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

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

    //add author
    @PostMapping("/authors")
    public Author addAuthor(@RequestBody Author author){
        return authorService.save(author);
    }

    //update author
    @PutMapping("/authors")
    public Author updateAuthor(@RequestBody Author author){
        return authorService.save(author);
    }


    //delete author by id
    @DeleteMapping("/authors/{id}")
    public String deleteAuthor(@PathVariable int id){
        authorService.deleteById(id);
        return "Author delete with ID: " + id;
    }
}
