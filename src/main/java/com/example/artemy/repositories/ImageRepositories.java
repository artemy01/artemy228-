package com.example.artemy.repositories;

import com.example.artemy.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepositories extends JpaRepository<Image,Long> {
}
