package com.ashu.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.signup.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
    
}
