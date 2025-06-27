package com.example.demo.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}