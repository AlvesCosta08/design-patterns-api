package com.alves.designpatterns.repository;

import com.alves.designpatterns.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

