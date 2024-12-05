package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Добавьте метод для поиска по имени пользователя
    Optional<User> findByUsername(String username);
}
