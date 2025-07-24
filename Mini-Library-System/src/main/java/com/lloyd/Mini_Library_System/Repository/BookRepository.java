package com.lloyd.Mini_Library_System.Repository;

import com.lloyd.Mini_Library_System.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
