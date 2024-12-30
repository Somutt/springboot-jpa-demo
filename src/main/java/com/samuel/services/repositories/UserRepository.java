package com.samuel.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.samuel.services.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {}