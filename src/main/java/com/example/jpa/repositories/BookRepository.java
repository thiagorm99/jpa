package com.example.jpa.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.models.BookModel;

public interface BookRepository extends JpaRepository<BookModel, UUID> {
    
    BookModel findBookModelByTitle(String title);
}
