package com.example.jpa.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.models.PublisherModel;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID>{
    
}
