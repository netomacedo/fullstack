package com.example.fullstack.repository;

import com.example.fullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    //findBy + UserName
    Optional<User> findByUserName(String userName);
}
