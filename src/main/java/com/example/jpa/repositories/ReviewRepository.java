package com.example.jpa.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.models.ReviewModel;

public interface ReviewRepository extends JpaRepository<ReviewModel, UUID>{
    
}
