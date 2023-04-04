package com.mockito.mockito.repository;

import com.mockito.mockito.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
