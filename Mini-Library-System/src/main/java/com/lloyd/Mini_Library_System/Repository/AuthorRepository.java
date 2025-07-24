package com.lloyd.Mini_Library_System.Repository;

import com.lloyd.Mini_Library_System.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer>{
}
