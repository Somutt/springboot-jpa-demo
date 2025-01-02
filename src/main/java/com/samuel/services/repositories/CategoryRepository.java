package com.samuel.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.samuel.services.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
