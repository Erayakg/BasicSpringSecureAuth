package com.example.securitydeneme.repo;

import com.example.securitydeneme.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByName(String username);
    List<User> findAll();

}
